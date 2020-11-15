package br.com.hopp.disrupt21.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.to.LocalAcontecimentoTo;;

public interface LocalAcontecimentoDao {
	
	List<LocalAcontecimentoTo> lista() throws SQLException, Exception;
	
	void atualizar (LocalAcontecimentoTo localAcontecimentoTo)throws SQLException, Exception;
	
	LocalAcontecimentoTo pesquisar(int id)throws SQLException, Exception;
	
	void remover(int id)throws SQLException, Exception;
	
	void cadastrar(LocalAcontecimentoTo localAcontecimentoTo )throws SQLException, Exception;
}
