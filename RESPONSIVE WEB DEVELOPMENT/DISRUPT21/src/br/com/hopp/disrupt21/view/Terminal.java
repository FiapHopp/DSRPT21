package br.com.hopp.disrupt21.view;

import java.util.List;

import br.com.hopp.disrupt21.bo.LinhaDoTempoBo;
import br.com.hopp.disrupt21.dao.oracle.UsuarioDaoOracle;
import br.com.hopp.disrupt21.to.LinhaDoTempoTo;
import br.com.hopp.disrupt21.to.UsuarioTo;

public class Terminal {

	public static void main(String[] args) throws Exception {
		//LinhaDoTempoDaoOracle daoOracle = new LinhaDoTempoDaoOracle();
		
		//System.out.println(daoOracle.lista().size());
		
//		LinhaDoTempoBo linhaBo = new LinhaDoTempoBo();
//		
//		List<LinhaDoTempoTo> listaLinhaTempo = linhaBo.lista();
//		
//		System.out.println("BO: " + listaLinhaTempo);

		UsuarioTo to = new UsuarioTo();
		
		to.setEmail("teste@teste.com");
		to.setNome("DaviEstagiario");
		
		UsuarioDaoOracle daoOracle =new UsuarioDaoOracle();
		
		daoOracle.cadastrar(to);
		
	}

}
