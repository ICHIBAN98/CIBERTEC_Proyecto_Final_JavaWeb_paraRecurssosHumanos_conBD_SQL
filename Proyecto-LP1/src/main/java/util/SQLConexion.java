package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConexion {
	public static Connection getConexion() {
	Connection con = null;
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/Proyecto_Final_LP1";
		String usr = "root";
		String psw = "mysql";
		con = DriverManager.getConnection(url,usr,psw);
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		System.out.println("Error >> Driver no Instalado!!"+e.getMessage());
	}catch (SQLException e) {
		// TODO: handle exception
		System.out.println("Error >> de conexión con la BD"+e.getMessage());
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Error >> general: "+ e.getMessage());
	}
	 return con;
	}
}