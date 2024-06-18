package com.classes.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	final static String NOME_DO_BANCO = "pedidos";
    public static Connection conectar() {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/" + NOME_DO_BANCO;
            return DriverManager.getConnection(url,"root","12345");
        } catch (Exception e) {
        	System.out.println("Erro: " + e.toString());
        	e.printStackTrace();
            return null;
        }
    }
}
