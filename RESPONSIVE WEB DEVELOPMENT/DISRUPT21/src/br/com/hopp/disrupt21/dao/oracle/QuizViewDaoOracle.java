package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hopp.disrupt21.dao.QuizDao;
import br.com.hopp.disrupt21.dao.QuizViewDao;
import br.com.hopp.disrupt21.factory.ConnectionFactory;
import br.com.hopp.disrupt21.to.QuizTo;
import br.com.hopp.disrupt21.to.QuizViewTo;

public class QuizViewDaoOracle implements QuizViewDao {

	@Override
	public List<QuizViewTo> lista() throws SQLException, Exception {
		Connection conexao = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = conexao.prepareStatement("Select * from V_QUIZ");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<QuizViewTo> lista = new ArrayList<QuizViewTo>();
		while (resultado.next()) {
			lista.add(parse(resultado));			
		}
		
		
		stmt.close();
		conexao.close();
		
		return lista;
	}

	private QuizViewTo parse(ResultSet resultado) throws SQLException {
		
		String nomeTitulo= resultado.getString("NM_TITULO");
		String pergunta= resultado.getString("PERGUNTA");
		int valorPergunta= resultado.getInt("VL_PERGUNTA");
		String respostaCerta= resultado.getString("RESPOSTA_CERTA");
		String resposta1= resultado.getString("RESPOSTA1");
		String resposta2= resultado.getString("RESPOSTA2");
		String resposta3= resultado.getString("RESPOSTA3");
		String resposta4= resultado.getString("RESPOSTA4");
		String resposta5= resultado.getString("RESPOSTA5");
		int idQuiz = resultado.getInt("ID_QUIZ");
		
		QuizViewTo to = new QuizViewTo(nomeTitulo, pergunta, valorPergunta, respostaCerta, resposta1, resposta2, resposta3, resposta4, resposta5,idQuiz);
		return to;
	}

	@Override
	public List<QuizViewTo> pesquisar(int id) throws SQLException, Exception {
		Connection conexao = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = conexao.prepareStatement("Select * from V_QUIZ where ID_QUIZ = ?");
		
		stmt.setInt(1, id);
		
		ResultSet resultado = stmt.executeQuery();
		
		
		List<QuizViewTo> lista = new ArrayList<QuizViewTo>();
		while (resultado.next()) {
			lista.add(parse(resultado));			
		}
		
		
		stmt.close();
		conexao.close();
		
		return lista;
	}

	
}
