package br.com.hopp.disrupt21.view;

import br.com.hopp.disrupt21.dao.oracle.LinhaDoTempoDaoOracle;
import br.com.hopp.disrupt21.dao.oracle.PersonagemDaoOracle;

public class Terminal {

	public static void main(String[] args) throws Exception {
		//LinhaDoTempoDaoOracle daoOracle = new LinhaDoTempoDaoOracle();
		
		//System.out.println(daoOracle.lista().size());
		
		PersonagemDaoOracle oracle = new PersonagemDaoOracle();
		
		System.out.println(oracle.lista().size());
		
	}

}
