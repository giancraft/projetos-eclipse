package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.PedProd;
import com.classes.DTO.Pedido;
import com.classes.DTO.Produto;
import interfaces.IPedProd;
import com.classes.Conexao.Conexao;


public class Ped_ProdDAO implements IPedProd{
	
final String NOMEDATABELA = "ped_prod";
	
	public boolean inserir(Pedido pedido, Produto produto, PedProd pp) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (ID_PEDIDO, ID_PROD)"
            +  " VALUES (?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getId());
            ps.setInt(2, produto.getId());
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
	
	 public boolean existe(PedProd pp) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ID_PEDPROD = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pp.getId());
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
	 
	 public boolean excluir(PedProd pp) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE ID_PEDPROD = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pp.getId());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	 
	 public PedProd procurarPorId(Pedido pedido, PedProd pp, Produto produto) {
	    	try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ID_PROD = ? AND ID_PEDIDO = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, produto.getId());
	            ps.setInt(2, pedido.getId());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                PedProd obj = new PedProd();
	                obj.setId(rs.getInt(1));
	                pp.setId(obj.getId());
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
	 
	 public List<PedProd> pesquisarTodos(Pedido pedido){
	    	try {
	    		Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<PedProd> listObj = montarLista(rs, pedido);
	            return listObj;
	    	} catch (Exception e) {
	            e.printStackTrace();
	            return null;
	    	}
	    }
	 
	 public List<PedProd> montarLista(ResultSet rs, Pedido pedido){
	    	List<PedProd> listObj = new ArrayList<PedProd>();
	    	try {
	    		while(rs.next()) {
	    			PedProd obj = new PedProd();
		            obj.setId(rs.getInt(1));
		            obj.setPedido(pedido);
	                listObj.add(obj);
	    		}
	    		return listObj;
	    	}catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	 

}
