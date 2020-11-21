package br.com.hopp.disrupt21.dao;

import java.sql.SQLException;

import br.com.hopp.disrupt21.to.TentativaTo;
import br.com.hopp.disrupt21.to.UsuarioTo;

public interface TentativaDao {
	
	void cadastrar(TentativaTo tentativaTo )throws SQLException, Exception;
	
}
