package br.com.hopp.disrupt21.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.to.QuizTo;

public interface QuizDao {
	
	List<QuizTo> lista() throws SQLException, Exception;
	
	void atualizar (QuizTo quizTo)throws SQLException, Exception;
	
	QuizTo pesquisar(int id)throws SQLException, Exception;
	
	void remover(int id)throws SQLException, Exception;
	
	void cadastrar(QuizTo quizTo )throws SQLException, Exception;
}
