package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hopp.disrupt21.connection.ConnectionManager;
import br.com.hopp.disrupt21.dao.QuizDao;
import br.com.hopp.disrupt21.to.QuizTo;

public class QuizDaoOracle implements QuizDao {
	
	private Connection conexao;
	
//	public QuizDaoOracle()throws Exception{
//		this.conexao = ConnectionManager.getInstance().getConnection();
//	}
	
	@Override
	protected void finalize() throws Throwable {
		this.conexao.close();
		super.finalize();

	}
	
	private QuizTo parse(ResultSet resultado) throws SQLException{
		int id = resultado.getInt("");
		String titulo = resultado.getString("");
		
		QuizTo quizTo =  new QuizTo(id, titulo);
		
		return quizTo;
	}
	
	@Override
	public List<QuizTo> lista() throws SQLException, Exception {
		PreparedStatement stmt = conexao.prepareStatement("");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<QuizTo> lista = new ArrayList<QuizTo>();
		while (resultado.next()) {
			lista.add(parse(resultado));			
		}
		return lista;
	}

	@Override
	public void atualizar(QuizTo quizTo) throws SQLException, Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public QuizTo pesquisar(int id) throws SQLException, Exception {
		PreparedStatement stmt = conexao.prepareStatement("");
		
		stmt.setInt(1, id);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next())
			return parse(resultado);
		
			return null;

	}

	@Override
	public void remover(int id) throws SQLException, Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void cadastrar(QuizTo quizTo) throws SQLException, Exception {
		// TODO Auto-generated method stub

	}

}
