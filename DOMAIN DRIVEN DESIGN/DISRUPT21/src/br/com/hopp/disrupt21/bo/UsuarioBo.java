package br.com.hopp.disrupt21.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.dao.oracle.UsuarioDaoOracle;
import br.com.hopp.disrupt21.factory.DAOFactory;
import br.com.hopp.disrupt21.to.UsuarioTo;

public class UsuarioBo {
	
	public UsuarioDaoOracle usuarioDaoOracle;
	
	public UsuarioBo() throws Exception{
		usuarioDaoOracle = (UsuarioDaoOracle) DAOFactory.getUsuarioDao();
	}
	
		
	public UsuarioTo pesquisar (int id) throws SQLException,Exception{
		return usuarioDaoOracle.pesquisar(id);
	}

	public List <UsuarioTo> lista () throws SQLException, Exception{
		return usuarioDaoOracle.lista();
	}
}
