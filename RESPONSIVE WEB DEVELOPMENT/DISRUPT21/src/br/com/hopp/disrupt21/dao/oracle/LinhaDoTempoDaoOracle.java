package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.hopp.disrupt21.factory.ConnectionFactory;
import br.com.hopp.disrupt21.dao.LinhaDoTempoDao;
import br.com.hopp.disrupt21.to.LinhaDoTempoTo;


public class LinhaDoTempoDaoOracle implements LinhaDoTempoDao {
		
	
	public List<LinhaDoTempoTo> lista() throws ClassNotFoundException, SQLException{
		
		Connection conexao = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = conexao.prepareStatement("Select * from V_LINHA_DO_TEMPO");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<LinhaDoTempoTo> lista = new ArrayList<LinhaDoTempoTo>();
		
		while (resultado.next()) {
			LinhaDoTempoTo listaTempo = parse(resultado);
			lista.add(listaTempo);
		}
		
		stmt.close();
		conexao.close();
		
		return lista;
		
	}
	
	private LinhaDoTempoTo parse(ResultSet resultado) throws SQLException {
		//int id = resultado.getInt("");
		String titulo = resultado.getString("TITULO");
		//int anoAcontecimento = resultado.getInt("");
		String acontecimento = resultado.getString("ACONTECIMENTO");
		String resumo = resultado.getString("RESUMO");
		//TempoAcontecimentoTo acontecimentoTo = new TempoAcontecimentoTo();
		//LocalAcontecimentoTo localAcontecimentoTo = new LocalAcontecimentoTo();
		
		LinhaDoTempoTo linhaDoTempoTo = new LinhaDoTempoTo(titulo, acontecimento, resumo);
		
		
		return linhaDoTempoTo;
	}
	
	
	

	
}
