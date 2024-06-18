package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Administrador;
import interfaces.IAdministrador;
import com.classes.Conexao.Conexao;

public class AdministradorDAO implements IAdministrador{
	final String NOMEDATABELA = "administrador";
    
    public boolean inserir(Administrador administrador) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (NOME, EMAIL, SENHA)"
            +  " VALUES (?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, administrador.getNome());
            ps.setString(2, administrador.getEmail());
            ps.setString(3, administrador.getSenha());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean existe(Administrador administrador) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ID_ADM = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, administrador.getId());
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
    
    public boolean alterar(Administrador administrador) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET NOME = ?, EMAIL = ?, SENHA = ? "
            		+ "WHERE ID_ADM = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, administrador.getNome());
            ps.setString(2, administrador.getEmail());
            ps.setString(3, administrador.getSenha());
            ps.setInt(4, administrador.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean excluir(Administrador administrador) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE ID_ADM = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, administrador.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Administrador procurarPorId(Administrador administrador) {
    	try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE EMAIL = ? AND SENHA = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, administrador.getEmail());
            ps.setString(2, administrador.getSenha());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Administrador obj = new Administrador();
                obj.setId(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setEmail(rs.getString(3));
                obj.setSenha(rs.getString(4));
                administrador.setId(obj.getId());
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
    
    public List<Administrador> pesquisarTodos(){
    	try {
    		Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Administrador> listObj = montarLista(rs);
            return listObj;
    	} catch (Exception e) {
            e.printStackTrace();
            return null;
    	}
    }
    
    public List<Administrador> montarLista(ResultSet rs){
    	List<Administrador> listObj = new ArrayList<Administrador>();
    	try {
    		while(rs.next()) {
    			Administrador obj = new Administrador();
    			obj.setId(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setEmail(rs.getString(3));
                obj.setSenha(rs.getString(4));
                listObj.add(obj);
    		}
    		return listObj;
    	}catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
