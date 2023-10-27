package GamePass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import GamePass.model.Games;

public interface GamePassRepository extends JpaRepository<Games, Long> {

	
	
}
