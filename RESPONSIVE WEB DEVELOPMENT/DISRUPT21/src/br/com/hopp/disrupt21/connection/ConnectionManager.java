package br.com.hopp.disrupt21.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public Connection DBConnectionManager() throws ClassNotFoundException, SQLException {
		String dbURL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
		String user = "rm85252";
		String pwd = "270393";
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection(dbURL, user, pwd);
	}
		
}