package br.com.hopp.disrupt21.connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionManager {

private static ConnectionManager single;
	
	private Properties configuracao;
	
	private ConnectionManager() throws FileNotFoundException, IOException{
		configuracao = new Properties();
		configuracao.load(new FileInputStream("banco.properties"));
	}
	
	public static ConnectionManager getInstance() throws FileNotFoundException, IOException{
		if(single ==null) {
			single = new ConnectionManager();
		}
		return single;
	}

	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conexao = DriverManager.getConnection(configuracao.getProperty("url"),
				configuracao.getProperty("usuario"),
				configuracao.getProperty("senha"));
		return conexao;
	}
	
}
