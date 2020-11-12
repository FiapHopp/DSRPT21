package br.com.hopp.disrupt21.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.dao.oracle.LocalAcontecimentoDaoOracle;
import br.com.hopp.disrupt21.factory.DAOFactory;
import br.com.hopp.disrupt21.to.LocalAcontecimentoTo;

public class LocalAcontecimentoBo {
	public LocalAcontecimentoDaoOracle localDao;
	
	public LocalAcontecimentoBo() throws Exception{
		localDao = (LocalAcontecimentoDaoOracle) DAOFactory.getLocalAcontecimentoDao();
	}
	
		
	public LocalAcontecimentoTo pesquisar (int id) throws SQLException,Exception{
		return localDao.pesquisar(id);
	}

	public List <LocalAcontecimentoTo> lista () throws SQLException, Exception{
		return localDao.lista();
	}
	

}
