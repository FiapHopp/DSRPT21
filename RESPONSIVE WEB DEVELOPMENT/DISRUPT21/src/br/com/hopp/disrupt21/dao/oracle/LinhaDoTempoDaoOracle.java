package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hopp.disrupt21.connection.ConnectionManager;
import br.com.hopp.disrupt21.dao.LinhaDoTempoDao;
import br.com.hopp.disrupt21.to.LinhaDoTempoTo;
import br.com.hopp.disrupt21.to.LocalAcontecimentoTo;
import br.com.hopp.disrupt21.to.TempoAcontecimentoTo;

public class LinhaDoTempoDaoOracle implements LinhaDoTempoDao {
	
	private Connection conexao;
	
	public LinhaDoTempoDaoOracle () throws Exception {
		this.conexao= ConnectionManager.getInstance().getConnection();

	}
	
	@Override
	protected void finalize() throws Throwable {
		this.conexao.close();
		super.finalize();

	}
	
	@Override
	public List<LinhaDoTempoTo> lista() throws SQLException, Exception {
		
		PreparedStatement stmt = conexao.prepareStatement("Select * from V_LINHA_DO_TEMPO");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<LinhaDoTempoTo> lista = new ArrayList<LinhaDoTempoTo>();
		while (resultado.next()) {
			lista.add(parse(resultado));			
		}
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

	@Override
	public void atualizar(LinhaDoTempoTo linhaDoTempoTo) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LinhaDoTempoTo pesquisar(int id) throws SQLException, Exception {
		PreparedStatement stmt = conexao.prepareStatement("");
		
		stmt.setInt(1, id);
		
		ResultSet resultado = stmt.executeQuery();
		
		if (resultado.next()) 
			return parse(resultado);
						
			return null;
	}

	@Override
	public void remover(int id) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(LinhaDoTempoTo linhaDoTempoTo) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}
	
}
