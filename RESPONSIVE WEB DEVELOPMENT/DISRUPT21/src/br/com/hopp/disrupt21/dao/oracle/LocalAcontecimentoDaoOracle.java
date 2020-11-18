package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hopp.disrupt21.connection.ConnectionManager;
import br.com.hopp.disrupt21.dao.LocalAcontecimentoDao;
import br.com.hopp.disrupt21.to.LocalAcontecimentoTo;

public class LocalAcontecimentoDaoOracle implements LocalAcontecimentoDao {
	
	private Connection conexao;
//	
//	public LocalAcontecimentoDaoOracle () throws Exception {
//		this.conexao= ConnectionManager.getInstance().getConnection();
//
//	}
	
	@Override
	protected void finalize() throws Throwable {
		this.conexao.close();
		super.finalize();

	}
	
	private LocalAcontecimentoTo parse(ResultSet resultado) throws SQLException{
		int id = resultado.getInt("");
		String nome = resultado.getString("");
		String resumo = resultado.getString("");
		
		LocalAcontecimentoTo localAcontecimentoTo = new LocalAcontecimentoTo(id, nome, resumo);
		
		return localAcontecimentoTo;
	}
	
	@Override
	public List<LocalAcontecimentoTo> lista() throws SQLException, Exception {
		PreparedStatement stmt = conexao.prepareStatement("");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<LocalAcontecimentoTo> lista = new ArrayList<LocalAcontecimentoTo>();
		while (resultado.next()) {
			lista.add(parse(resultado));			
		}
		return lista;
	}

	@Override
	public void atualizar(LocalAcontecimentoTo localAcontecimentoTo) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalAcontecimentoTo pesquisar(int id) throws SQLException, Exception {
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
	public void cadastrar(LocalAcontecimentoTo localAcontecimentoTo) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

}
