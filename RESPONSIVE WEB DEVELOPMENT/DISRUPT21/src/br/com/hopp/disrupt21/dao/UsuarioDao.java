package br.com.hopp.disrupt21.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.to.UsuarioTo;

public interface UsuarioDao {
	
	List<UsuarioTo> lista() throws SQLException, Exception;
	
	void atualizar (UsuarioTo usuarioTo)throws SQLException, Exception;
	
	UsuarioTo pesquisar(int id)throws SQLException, Exception;
	
	void remover(int id)throws SQLException, Exception;
	
	void cadastrar(UsuarioTo usuarioTo )throws SQLException, Exception;
}
