package br.net.bonassi.N64.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.bonassi.N64.model.entities.Game;
import br.net.bonassi.N64.model.repositories.GameRepository;

@RestController
@RequestMapping(path = "/api/game")
public class GameController {

	@Autowired
	private GameRepository gameRepository;

	@GetMapping(path = "/page/{numeroPagina}/{qtdePorPagina}")
	public Iterable<Game> getGamesPerPage(@PathVariable int numeroPagina, @PathVariable int qtdePorPagina) {
		if (qtdePorPagina > 10)
			qtdePorPagina = 10;
		Pageable page = PageRequest.of(numeroPagina, qtdePorPagina);
		return gameRepository.findAll(page);
	}

	@GetMapping(path = "/{parteNome}")
	public Iterable<Game> getGameByName(@PathVariable String parteNome) {
		return gameRepository.findByNameContainingIgnoreCase(parteNome);
	}
	
}
