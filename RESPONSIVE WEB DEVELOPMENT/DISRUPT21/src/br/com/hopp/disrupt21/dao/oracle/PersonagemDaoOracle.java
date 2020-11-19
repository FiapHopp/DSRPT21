package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.hopp.disrupt21.connection.ConnectionManager;
import br.com.hopp.disrupt21.dao.PersonagemDao;
import br.com.hopp.disrupt21.factory.ConnectionFactory;
import br.com.hopp.disrupt21.to.AtorTo;
import br.com.hopp.disrupt21.to.LinhaDoTempoTo;
import br.com.hopp.disrupt21.to.PersonagemTo;

public class PersonagemDaoOracle implements PersonagemDao {
	private Connection conexao;
	
//	public PersonagemDaoOracle()throws Exception{
//		this.conexao = ConnectionManager.getInstance().getConnection();
//	}
	
	@Override
	protected void finalize() throws Throwable {
		this.conexao.close();
		super.finalize();

	}

	private PersonagemTo parse(ResultSet resultado)throws SQLException{
		int id = resultado.getInt("ID_PERSONAGEM");
		String idadePersonagem = resultado.getString("DT_NASCIMENTO");
		//int idAtor = resultado.getInt("");
		String nomePersonagem = resultado.getString("NM_PERSONAGEM");
		String resumo = resultado.getString("RESUMO");
		String sexo = resultado.getNString("SEXO");
		String imgPass = resultado.getString("IMGPASS");
		String imgPres = resultado.getString("IMGPRES");
		
		//AtorTo atorTo = new AtorTo(idAtor);
		
		PersonagemTo personagemTo = new PersonagemTo(id, nomePersonagem, idadePersonagem, resumo,sexo,imgPass,imgPres);
		
		return personagemTo;
		
	}

	@Override
	public List<PersonagemTo> lista() throws SQLException, Exception {
		Connection conexaumo = ConnectionFactory.getConnection();
		PreparedStatement stmt = conexaumo.prepareStatement("Select * from T_PERSONAGEM");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<PersonagemTo> lista = new ArrayList<PersonagemTo>();
		while (resultado.next()) {
			lista.add(parse(resultado));			
		}
		return lista;
	}

	@Override
	public void atualizar(PersonagemTo personagemTo) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonagemTo pesquisar(int id) throws SQLException, Exception {
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
	public void cadastrar(PersonagemTo personagemTo) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}
