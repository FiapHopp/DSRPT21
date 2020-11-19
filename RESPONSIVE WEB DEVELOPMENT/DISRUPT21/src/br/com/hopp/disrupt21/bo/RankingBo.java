package br.com.hopp.disrupt21.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.hopp.disrupt21.dao.oracle.RankingDaoOracle;
import br.com.hopp.disrupt21.factory.DAOFactory;
import br.com.hopp.disrupt21.to.RankingTo;
import br.com.hopp.disrupt21.to.UsuarioTo;

public class RankingBo {
	public RankingDaoOracle rankingDaoOracle;
	
	public RankingBo()throws Exception{
		rankingDaoOracle =(RankingDaoOracle) DAOFactory.getRankingDao();
	}
	
	public List<RankingTo> lista () throws SQLException, Exception{
		return rankingDaoOracle.lista();
	}
}
