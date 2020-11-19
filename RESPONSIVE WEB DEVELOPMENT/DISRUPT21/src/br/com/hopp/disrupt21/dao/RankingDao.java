package br.com.hopp.disrupt21.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.to.RankingTo;
import br.com.hopp.disrupt21.to.UsuarioTo;

public interface RankingDao {
	
	List<RankingTo> lista() throws SQLException, Exception;
}
