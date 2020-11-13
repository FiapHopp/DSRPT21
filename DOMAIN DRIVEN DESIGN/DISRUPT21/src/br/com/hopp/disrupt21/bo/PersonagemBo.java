package br.com.hopp.disrupt21.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.dao.oracle.PersonagemDaoOracle;
import br.com.hopp.disrupt21.factory.DAOFactory;
import br.com.hopp.disrupt21.to.PersonagemTo;

public class PersonagemBo {
	
	public PersonagemDaoOracle personagemDaoOracle;
	
	public PersonagemBo() throws Exception{
		personagemDaoOracle = (PersonagemDaoOracle) DAOFactory.getPersonagemDao();
	}
		
	public PersonagemTo pesquisar (int id) throws SQLException,Exception{
		return personagemDaoOracle.pesquisar(id);
	}

	public List<PersonagemTo> lista () throws SQLException, Exception{
		return personagemDaoOracle.lista();
	}
}
