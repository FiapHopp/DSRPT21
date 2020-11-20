package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hopp.disrupt21.connection.ConnectionManager;
import br.com.hopp.disrupt21.dao.UsuarioDao;
import br.com.hopp.disrupt21.factory.ConnectionFactory;
import br.com.hopp.disrupt21.to.RankingTo;
import br.com.hopp.disrupt21.to.UsuarioTo;

public class UsuarioDaoOracle implements UsuarioDao {
	
//	private Connection conexao;
	
//	public UsuarioDaoOracle () throws Exception {
//		this.conexao= ConnectionManager.getInstance().getConnection();
//
//	}
	
//	@Override
//	protected void finalize() throws Throwable {
//		this.conexao.close();
//		super.finalize();
//
//	}
	
	private UsuarioTo parse(ResultSet resultado) throws SQLException{
		String nome = resultado.getString("");
		int id = resultado.getInt("");
		String email = resultado.getString("");
		
		UsuarioTo to = new UsuarioTo(id, nome, email);
		
		return to;
	}
	
	
	@Override
	public List<UsuarioTo> lista() throws SQLException, Exception {
		Connection conexao = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = conexao.prepareStatement("");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<UsuarioTo> lista = new ArrayList<UsuarioTo>();
		while (resultado.next()) {
			lista.add(parse(resultado));			
		}
		stmt.close();
		conexao.close();
		return lista;
	}

	@Override
	public void atualizar(UsuarioTo usuarioTo) throws SQLException, Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public UsuarioTo pesquisar(int id) throws SQLException, Exception {
	
		return null;

	}

	@Override
	public void remover(int id) throws SQLException, Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void cadastrar(UsuarioTo usuarioTo) throws SQLException, Exception {
		Connection conexao = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = conexao.prepareStatement("Insert into T_USUARIO(ID_USUARIO,NM_USUARIO,EMAIL)"
				+ "values(T_USUARIO_SEQ.NEXTVAL,?,?)");
		
		stmt.setString(1, usuarioTo.getNome());
		stmt.setString(2, usuarioTo.getEmail());
		
		stmt.executeUpdate();
		stmt.close();
		conexao.close();
	}

}
