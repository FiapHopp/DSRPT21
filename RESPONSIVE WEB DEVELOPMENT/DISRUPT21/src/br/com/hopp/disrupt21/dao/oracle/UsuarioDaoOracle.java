package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hopp.disrupt21.connection.ConnectionManager;
import br.com.hopp.disrupt21.dao.UsuarioDao;
import br.com.hopp.disrupt21.to.UsuarioTo;

public class UsuarioDaoOracle implements UsuarioDao {
	
	private Connection conexao;
	
//	public UsuarioDaoOracle () throws Exception {
//		this.conexao= ConnectionManager.getInstance().getConnection();
//
//	}
	
	@Override
	protected void finalize() throws Throwable {
		this.conexao.close();
		super.finalize();

	}
	
	private UsuarioTo parse(ResultSet resultado) throws SQLException{
		int id = resultado.getInt("");
		String nome = resultado.getString("");
		String email = resultado.getString("");
		
		UsuarioTo usuarioTo = new UsuarioTo(id, nome, email);
		
		return usuarioTo;
	}
	
	
	@Override
	public List<UsuarioTo> lista() throws SQLException, Exception {
		PreparedStatement stmt = conexao.prepareStatement("");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<UsuarioTo> lista = new ArrayList<UsuarioTo>();
		while (resultado.next()) {
			lista.add(parse(resultado));			
		}
		return lista;
	}

	@Override
	public void atualizar(UsuarioTo usuarioTo) throws SQLException, Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public UsuarioTo pesquisar(int id) throws SQLException, Exception {
		PreparedStatement stmt = conexao.prepareStatement("");
		
		stmt.setInt(1, id);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next())
			return parse(resultado);
		
			return null;

	}

	@Override
	public void remover(int id) throws SQLException, Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void cadastrar(UsuarioTo usuarioTo) throws SQLException, Exception {
		PreparedStatement stmt = conexao.prepareStatement("");
		
		stmt.setInt(1,usuarioTo.getId());
		stmt.setString(2, usuarioTo.getEmail());
		stmt.setString(3, usuarioTo.getNome());
		
		stmt.executeUpdate();
		
	}

}
