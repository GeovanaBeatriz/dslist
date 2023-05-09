package com.geovanabeatriz.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanabeatriz.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
