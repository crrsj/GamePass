package GamePass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import GamePass.model.Games;
import GamePass.repository.GamePassRepository;
import GamePass.support.AtualizarSistemaDeJogos;
import GamePass.support.BuscarGames;
import GamePass.support.SistemaDeJogos;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/game")
public class GamePassController {
     @Autowired
	 private GamePassRepository gamePassRepository;
     
     @PostMapping 
     @Transactional
     public void cadastro(@RequestBody SistemaDeJogos jogos) {
    	 gamePassRepository.save(new Games(jogos));
     }
	 
     @GetMapping
     public List<BuscarGames>listar(){
    	return gamePassRepository.findAll().stream().map(BuscarGames::new).toList();
     }
     
     @PutMapping
     @Transactional
     public void atualizar(@RequestBody AtualizarSistemaDeJogos jogos) {
    	var game = gamePassRepository.getReferenceById(jogos.id());
    	game.atualizarGames(jogos);
     }
     
     @DeleteMapping("/{id}")
     @Transactional
     public void excluir( @PathVariable Long id) {    	 
    	 gamePassRepository.deleteById(id);
     }
}
