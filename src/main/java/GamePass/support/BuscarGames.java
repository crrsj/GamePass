package GamePass.support;

import java.util.Date;

import GamePass.model.Games;



public record BuscarGames(Long id,String nome,String categoria,String desenvolvedora,Date lancamento,int classificacao) {
	public BuscarGames(Games games)	{
		this(games.getId(),games.getNome(),games.getCategoria(),games.getDesenvolvedora(),games.getLancamento(),games.getClassificacao());
	}
		
		
		
		
     
	

}
