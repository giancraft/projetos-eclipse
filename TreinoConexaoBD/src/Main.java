import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Main {

	public static void main(String[] args) {
		Comunica comunica = Comunica.getInstance();
		Connection conn = comunica.conectar();
		try {
			PreparedStatement ps = (PreparedStatement) conn . prepareStatement ("SELECT * FROM banco");
			java.sql.ResultSet rs = ps.executeQuery ();
			while(rs.next()) {
				System.out.println("Usuário: " + rs.getString(1));
				System.out.println("Senha: " + rs.getString(2));
				System.out.println("Host: " + rs.getString(3));
				System.out.println("Porta: " + rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
