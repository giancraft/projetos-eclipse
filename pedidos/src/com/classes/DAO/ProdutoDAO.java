package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Administrador;
import com.classes.DTO.Produto;
import interfaces.IProduto;
import com.classes.Conexao.Conexao;

public class ProdutoDAO implements IProduto{
	
final String NOMEDATABELA = "produto";
    
    public boolean inserir(Produto produto, Administrador adm) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (NOME, DESCRICAO, PRECO, QUANTIDADE, ID_ADM)"
            +  " VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setFloat(3, produto.getPreco());
            ps.setInt(4, produto.getQuantidade());
            ps.setInt(5, adm.getId());
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
    
    public boolean existe(Produto produto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE ID_PROD = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, produto.getId());
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
    
    public boolean alterar(Produto produto, Administrador adm) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET NOME = ?, DESCRICAO = ?, PRECO = ?, QUANTIDADE = ?, "
            		+ "ID_ADM = ? WHERE ID_PROD = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setFloat(3, produto.getPreco());
            ps.setInt(4, produto.getQuantidade());
            ps.setInt(5, adm.getId());
            ps.setInt(6, produto.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean excluir(Produto produto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE ID_PROD = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, produto.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public Produto procurarPorId(Produto produto, Administrador adm) {
    	try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE NOME = ? AND DESCRICAO = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Produto obj = new Produto();
                obj.setId(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setDescricao(rs.getString(3));
                obj.setPreco(rs.getFloat(4));
                obj.setQuantidade(rs.getInt(5));
                obj.setAdministrador(adm);
                produto.setId(obj.getId());
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
    
    public List<Produto> pesquisarTodos(Administrador adm){
    	try {
    		Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Produto> listObj = montarLista(rs, adm);
            return listObj;
    	} catch (Exception e) {
            e.printStackTrace();
            return null;
    	}
    }
    
    public List<Produto> montarLista(ResultSet rs, Administrador adm){
    	List<Produto> listObj = new ArrayList<Produto>();
    	try {
    		while(rs.next()) {
    			Produto obj = new Produto();
                obj.setId(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setDescricao(rs.getString(3));
                obj.setPreco(rs.getFloat(4));
                obj.setQuantidade(rs.getInt(5));
                obj.setAdministrador(adm);
                listObj.add(obj);
    		}
    		return listObj;
    	}catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
