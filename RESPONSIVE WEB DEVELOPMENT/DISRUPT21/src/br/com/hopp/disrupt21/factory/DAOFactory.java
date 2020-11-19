package br.com.hopp.disrupt21.factory;

import br.com.hopp.disrupt21.dao.LinhaDoTempoDao;
import br.com.hopp.disrupt21.dao.LocalAcontecimentoDao;
import br.com.hopp.disrupt21.dao.PersonagemDao;
import br.com.hopp.disrupt21.dao.QuizDao;
import br.com.hopp.disrupt21.dao.QuizViewDao;
import br.com.hopp.disrupt21.dao.RankingDao;
import br.com.hopp.disrupt21.dao.UsuarioDao;
import br.com.hopp.disrupt21.dao.oracle.LinhaDoTempoDaoOracle;
import br.com.hopp.disrupt21.dao.oracle.LocalAcontecimentoDaoOracle;
import br.com.hopp.disrupt21.dao.oracle.PersonagemDaoOracle;
import br.com.hopp.disrupt21.dao.oracle.QuizDaoOracle;
import br.com.hopp.disrupt21.dao.oracle.QuizViewDaoOracle;
import br.com.hopp.disrupt21.dao.oracle.RankingDaoOracle;
import br.com.hopp.disrupt21.dao.oracle.UsuarioDaoOracle;

public class DAOFactory {
	
	public static LocalAcontecimentoDao getLocalAcontecimentoDao()throws Exception{
		return new LocalAcontecimentoDaoOracle();
	}
	
	public static LinhaDoTempoDao getLinhaDoTempoDao()throws Exception{
		return new LinhaDoTempoDaoOracle();
	}
	
	public static PersonagemDao getPersonagemDao()throws Exception{
		return new PersonagemDaoOracle();
	}
	
	public static QuizDao getQuizDao()throws Exception{
		return new QuizDaoOracle();
	}
	public static UsuarioDao getUsuarioDao()throws Exception{
		return new UsuarioDaoOracle();
	}
	public static RankingDao getRankingDao()throws Exception{
		return new RankingDaoOracle();
	}
	public static QuizViewDaoOracle getQuizViewDao()throws Exception{
		return new QuizViewDaoOracle();
	}
	
}
