package br.com.hopp.disrupt21.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hopp.disrupt21.dao.RankingDao;
import br.com.hopp.disrupt21.factory.ConnectionFactory;
import br.com.hopp.disrupt21.to.RankingTo;

public class RankingDaoOracle implements RankingDao {
	
	
	
//	@Override
//	protected void finalize() throws Throwable {
//		this.conexao.close();
//		super.finalize();
//
//	}
	
	@Override
	public List<RankingTo> lista() throws SQLException, Exception {
		Connection conexao = ConnectionFactory.getConnection();

		
		PreparedStatement stmt = conexao.prepareStatement("Select * from V_RANKING");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<RankingTo> lista = new ArrayList<RankingTo>();
		
		while (resultado.next()) {
			lista.add(parse(resultado));
		}
		return lista;
	}

	private RankingTo parse(ResultSet resultado)throws SQLException {
	
		String nomeUsuario=resultado.getString("NM_USUARIO");
		int pontuacao= resultado.getInt("PONTOS");
		
		RankingTo rankingTo= new RankingTo(nomeUsuario, pontuacao);
		
		return rankingTo;
	}

}
