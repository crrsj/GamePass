package GamePass.support;

import java.util.Date;

public record AtualizarSistemaDeJogos (Long id,
		String nome,
		String categoria,
		String desenvolvedora,
		Date lancamento,
		int classificacao) {

}
