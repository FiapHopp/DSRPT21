package br.com.hopp.disrupt21.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.to.PersonagemTo;;

public interface PersonagemDao {
	
	List<PersonagemTo> lista() throws SQLException, Exception;
	
	void atualizar (PersonagemTo personagemTo)throws SQLException, Exception;
	
	PersonagemTo pesquisar(int id)throws SQLException, Exception;
	
	void remover(int id)throws SQLException, Exception;
	
	void cadastrar(PersonagemTo personagemTo )throws SQLException, Exception;
}
