package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import com.classes.DTO.Cliente;
import interfaces.ICliente;
import com.classes.Conexao.Conexao;


public class ClienteDAO implements ICliente{
	 final String NOMEDATABELA = "cliente";
	    
	    public boolean inserir(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (NOME, EMAIL, SENHA, ENDERECO, "
	            + "NUMERO_TEL, DATA_NASC) VALUES (?, ?, ?, ?, ?, ?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, cliente.getNome());
	            ps.setString(2, cliente.getEmail());
	            ps.setString(3, cliente.getSenha());
	            ps.setString(4, cliente.getEndereco());
	            ps.setString(5, cliente.getNumeroTel());
	            ps.setDate(6, Date.valueOf(cliente.getDataNascimento()));
	            ps.executeUpdate();
	            ps.close();
	            String sqlIdCliente = "SELECT ID_CLIENTE FROM cliente WHERE EMAIL = ? AND SENHA = ?;";
	            PreparedStatement psIdCliente = conn.prepareStatement(sqlIdCliente);
	            psIdCliente.setString(1, cliente.getEmail());
	            psIdCliente.setString(2, cliente.getSenha());
	            ResultSet rsIdCliente = psIdCliente.executeQuery();
	            int idCliente = 0;
	            if (rsIdCliente.next()) {
	                idCliente = rsIdCliente.getInt("ID_CLIENTE");
	            }
	            cliente.setId(idCliente);
	            psIdCliente.close();
	            rsIdCliente.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	        
	    }
	    
	    public boolean existe(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ID_CLIENTE = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, cliente.getId());
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
	    public boolean alterar(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET NOME = ?, EMAIL = ?, SENHA = ?, "
	            		+ "ENDERECO = ?, NUMERO_TEL = ? WHERE ID_CLIENTE = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, cliente.getNome());
	            ps.setString(2, cliente.getEmail());
	            ps.setString(3, cliente.getSenha());
	            ps.setString(4, cliente.getEndereco());
	            ps.setString(5, cliente.getNumeroTel());
	            ps.setInt(6, cliente.getId());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    
	    public boolean excluir(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE ID_CLIENTE = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, cliente.getId());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    
	    public Cliente procurarPorId(Cliente cliente) {
	    	try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE EMAIL = ? AND SENHA = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, cliente.getEmail());
	            ps.setString(2, cliente.getSenha());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                Cliente obj = new Cliente();
	                obj.setId(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setEmail(rs.getString(3));
	                obj.setSenha(rs.getString(4));
	                obj.setEndereco(rs.getString(5));
	                obj.setNumeroTel(rs.getString(6));
	                obj.setDataNascimento(rs.getDate(7).toLocalDate());
	                cliente.setId(obj.getId());
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
	    
	    public List<Cliente> pesquisarTodos(){
	    	try {
	    		Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Cliente> listObj = montarLista(rs);
	            return listObj;
	    	} catch (Exception e) {
	            e.printStackTrace();
	            return null;
	    	}
	    }
	    
	    public List<Cliente> montarLista(ResultSet rs){
	    	List<Cliente> listObj = new ArrayList<Cliente>();
	    	try {
	    		while(rs.next()) {
	    			Cliente obj = new Cliente();
	    			obj.setId(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setEmail(rs.getString(3));
	                obj.setSenha(rs.getString(4));
	                obj.setEndereco(rs.getString(5));
	                obj.setNumeroTel(rs.getString(6));
	                obj.setDataNascimento(rs.getDate(7).toLocalDate());
	                listObj.add(obj);
	    		}
	    		return listObj;
	    	}catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
}
