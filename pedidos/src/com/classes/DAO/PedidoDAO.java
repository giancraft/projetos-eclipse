package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import com.classes.DTO.Cliente;
import com.classes.DTO.Pedido;
import interfaces.IPedido;
import com.classes.Conexao.Conexao;

public class PedidoDAO implements IPedido{
	
	final String NOMEDATABELA = "pedido";
	
	public boolean inserir(Pedido pedido, Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (DATA, ID_CLIENTE)"
            +  " VALUES (?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(pedido.getData()));
            ps.setInt(2, cliente.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	System.out.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
        }
    }
	
	 public boolean existe(Pedido pedido) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ID_PEDIDO = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pedido.getId());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                ps.close();
	                rs.close();
	                conn.close();
	                return true;
	            }
	        } catch (Exception e) {
	           e.printStackTrace();
	            return false;
	        }
	        return false;
	    }
	 
	 public boolean excluir(Pedido pedido) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE ID_PEDIDO = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pedido.getId());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	 
	 public Pedido procurarPorId(Pedido pedido, Cliente cliente) {
	    	try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ID_CLIENTE = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, cliente.getId());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                Pedido obj = new Pedido();
	                obj.setId(rs.getInt(1));
	                obj.setData(rs.getDate(2).toLocalDate());
	                obj.setCliente(cliente);
	                pedido.setId(obj.getId());
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                return null;
	            }
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return null;
	        }
	    }
	 
	 public List<Pedido> pesquisarTodos(Cliente cliente){
	    	try {
	    		Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Pedido> listObj = montarLista(rs, cliente);
	            return listObj;
	    	} catch (Exception e) {
	            e.printStackTrace();
	            return null;
	    	}
	    }
	 
	 public List<Pedido> montarLista(ResultSet rs, Cliente cliente){
	    	List<Pedido> listObj = new ArrayList<Pedido>();
	    	try {
	    		while(rs.next()) {
	    			Pedido obj = new Pedido();
	                obj.setId(rs.getInt(1));
	                obj.setData(rs.getDate(2).toLocalDate());
	                obj.setCliente(cliente);
	                listObj.add(obj);
	    		}
	    		return listObj;
	    	}catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

}
