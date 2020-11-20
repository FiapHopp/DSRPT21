package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.hopp.disrupt21.dao.TentativaDao;
import br.com.hopp.disrupt21.factory.ConnectionFactory;
import br.com.hopp.disrupt21.to.TentativaTo;

public class TentativaDaoOracle implements TentativaDao {
	
	private TentativaTo parse(ResultSet resultado) throws SQLException{
		int id = resultado.getInt("ID_TENTATIVA");
		int idUsuario = resultado.getInt("FK_ID_USUARIO");
		int idQuiz = resultado.getInt("FK_ID_QUIZ");
		int pontos = resultado.getInt("PONTOS");
		Date dataRegistro = resultado.getDate("DT_REGISTRO");
		
		TentativaTo to = new TentativaTo(id,idUsuario,idQuiz,pontos,dataRegistro);
		
		return to;
	}
	@Override
	public void cadastrar(TentativaTo tentativaTo) throws SQLException, Exception {
		Connection conexao = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = conexao.prepareStatement("INSERT INTO T_Tentativa(ID_TENTATIVA,FK_ID_USUARIO,FK_ID_QUIZ,pontos,dt_registro) "
				+ "VALUES(T_TENTATIVA_SEQ.NEXTVAL,4,?,?,CURRENT_TIMESTAMP)");

		
		stmt.setInt(1, tentativaTo.getIdQuiz());
		stmt.setInt(2, tentativaTo.getPontos());
		
		stmt.executeUpdate();
		stmt.close();
		conexao.close();
	}

	
}
