package br.com.hopp.disrupt21.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.to.QuizTo;
import br.com.hopp.disrupt21.to.QuizViewTo;


public interface QuizViewDao {
	
	List<QuizViewTo> lista() throws SQLException, Exception;
	
	List<QuizViewTo> pesquisar(int id)throws SQLException, Exception;
	
	List<QuizViewTo> pesquisarRandom()throws SQLException, Exception;
}
