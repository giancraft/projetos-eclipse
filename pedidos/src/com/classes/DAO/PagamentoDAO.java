package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Pagamento;
import com.classes.DTO.PedProd;
import com.classes.DTO.Pedido;
import interfaces.IPagamento;
import com.classes.Conexao.Conexao;

public class PagamentoDAO implements IPagamento{

final String NOMEDATABELA = "pagamento";
	
	public boolean inserir(Pagamento pagamento, PedProd pp) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (METODO_PAGAMENTO, VALOR_PAGAR, ID_PEDPROD)"
            +  " VALUES (?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pagamento.getMetodoPagamento());
            ps.setFloat(2, pagamento.getValorPagar());
            ps.setInt(3, pp.getId());
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
	
	public boolean existe(Pagamento pagamento) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ID_PAG = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pagamento.getId());
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
	
	public boolean alterar(Pagamento pagamento, PedProd pp) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET METODO_PAGAMENTO = ?, VALOR_PAGAR = ?, ID_PEDPROD = ?"
            		+ " WHERE ID_PAG = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pagamento.getMetodoPagamento());
            ps.setFloat(2, pagamento.getValorPagar());
            ps.setInt(3, pp.getId());
            ps.setInt(4, pagamento.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
	
	public boolean excluir(Pagamento pagamento) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE ID_PAG = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pagamento.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
	
	 public Pagamento procurarPorId(Pagamento pagamento, PedProd pp) {
	    	try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ID_PEDPROD = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pp.getId());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                Pagamento obj = new Pagamento();
	                obj.setId(rs.getInt(1));
	                obj.setMetodoPagamento(rs.getString(2));
	                obj.setValorPagar(rs.getFloat(3));
	                pagamento.setId(obj.getId());
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
	 
	 public List<Pagamento> pesquisarTodos(Pedido pedido){
	    	try {
	    		Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Pagamento> listObj = montarLista(rs, pedido);
	            return listObj;
	    	} catch (Exception e) {
	            e.printStackTrace();
	            return null;
	    	}
	    }
	 
	 public List<Pagamento> montarLista(ResultSet rs, Pedido pedido){
	    	List<Pagamento> listObj = new ArrayList<Pagamento>();
	    	try {
	    		while(rs.next()) {
	    			Pagamento obj = new Pagamento();
	                obj.setId(rs.getInt(1));
	                obj.setMetodoPagamento(rs.getString(2));
	                obj.setValorPagar(rs.getFloat(3));
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
