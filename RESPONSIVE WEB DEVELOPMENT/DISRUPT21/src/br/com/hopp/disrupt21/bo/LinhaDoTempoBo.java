package br.com.hopp.disrupt21.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.dao.oracle.LinhaDoTempoDaoOracle;
import br.com.hopp.disrupt21.factory.DAOFactory;
import br.com.hopp.disrupt21.to.LinhaDoTempoTo;

public class LinhaDoTempoBo {
	
	public LinhaDoTempoDaoOracle linhaDoTempoDaoOracle;
	
	public LinhaDoTempoBo() throws Exception{
		linhaDoTempoDaoOracle = (LinhaDoTempoDaoOracle) DAOFactory.getLinhaDoTempoDao();
	}
		
	public LinhaDoTempoTo pesquisar (int id) throws SQLException,Exception{
		return linhaDoTempoDaoOracle.pesquisar(id);
	}

	public List <LinhaDoTempoTo> lista () throws SQLException, Exception{
		System.out.println("ENTROU NO LISTA BO");
		return linhaDoTempoDaoOracle.lista();
	}
}
