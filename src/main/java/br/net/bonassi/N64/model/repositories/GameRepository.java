package br.net.bonassi.N64.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.net.bonassi.N64.model.entities.Game;

public interface GameRepository extends PagingAndSortingRepository<Game, Integer>{

	public Iterable<Game> findByNameContainingIgnoreCase(String parteNome);
}
