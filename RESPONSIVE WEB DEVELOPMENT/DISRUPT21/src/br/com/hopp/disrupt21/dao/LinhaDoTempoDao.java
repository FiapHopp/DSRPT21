package br.com.hopp.disrupt21.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.to.LinhaDoTempoTo;

public interface LinhaDoTempoDao {
	
	List<LinhaDoTempoTo> lista() throws SQLException, Exception;
	
	
}
