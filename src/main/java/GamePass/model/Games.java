package GamePass.model;

import java.util.Date;



import GamePass.support.AtualizarSistemaDeJogos;
import GamePass.support.SistemaDeJogos;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "games")
@Table(name = "Games")
public class Games {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String categoria;
	private String desenvolvedora;
	private Date lancamento;
	private int classificacao;
	public Games(Long id, String nome, String categoria, String desenvolvedora, Date lancamento, int classificacao) {
		
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.desenvolvedora = desenvolvedora;
		this.lancamento = lancamento;
		this.classificacao = classificacao;
	}
	public Games() {
		
		
	}
	public Games(SistemaDeJogos jogos) {
		
		this.nome = jogos.nome();
		this.categoria = jogos.categoria();
		this.desenvolvedora = jogos.desenvolvedora();
		this.lancamento = jogos.lancamento();
		this.classificacao = jogos.classificacao();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDesenvolvedora() {
		return desenvolvedora;
	}
	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}
	public Date getLancamento() {
		return lancamento;
	}
	public void setLancamento(Date lancamento) {
		this.lancamento = lancamento;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public void atualizarGames(AtualizarSistemaDeJogos jogos) {
		if(jogos.nome() != null) {
			this.nome = jogos.nome();
		}
		if(jogos.categoria() != null) {
			this.categoria = jogos.categoria();
		}
		if(jogos.desenvolvedora() != null) {
			this.desenvolvedora = jogos.desenvolvedora();
		}
	    if(jogos.lancamento() != null) {
		  this.lancamento = jogos.lancamento();
	  }
	    
	}
	
}