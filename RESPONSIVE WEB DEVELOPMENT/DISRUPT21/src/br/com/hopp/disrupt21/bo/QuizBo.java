package br.com.hopp.disrupt21.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.dao.oracle.QuizDaoOracle;
import br.com.hopp.disrupt21.factory.DAOFactory;
import br.com.hopp.disrupt21.to.QuizTo;

public class QuizBo {
	
	public QuizDaoOracle quizDaoOracle;
	
	public QuizBo() throws Exception{
		quizDaoOracle = (QuizDaoOracle) DAOFactory.getQuizDao();
	}
		
	public QuizTo pesquisar (int id) throws SQLException,Exception{
		return quizDaoOracle.pesquisar(id);
	}

	public List <QuizTo> lista () throws SQLException, Exception{
		return quizDaoOracle.lista();
	}
}
