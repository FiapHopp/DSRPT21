package br.com.hopp.disrupt21.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.dao.oracle.QuizViewDaoOracle;
import br.com.hopp.disrupt21.dao.oracle.RankingDaoOracle;
import br.com.hopp.disrupt21.factory.DAOFactory;
import br.com.hopp.disrupt21.to.QuizViewTo;
import br.com.hopp.disrupt21.to.RankingTo;

public class QuizViewBo {
	public QuizViewDaoOracle viewDaoOracle;
	
	public QuizViewBo()throws Exception{
		viewDaoOracle =(QuizViewDaoOracle) DAOFactory.getQuizViewDao();
	}
	
	public List<QuizViewTo> lista () throws SQLException, Exception{
		return viewDaoOracle.lista();
	}
	
	public QuizViewTo pesquisar(int id) throws SQLException, Exception {
		return viewDaoOracle.pesquisar(id);
		
	}
	
}
