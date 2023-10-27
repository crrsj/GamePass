package GamePass.support;

import java.util.Date;

public record SistemaDeJogos(String nome,
		String categoria,
		String desenvolvedora,
		Date lancamento,
		int classificacao) {

}
