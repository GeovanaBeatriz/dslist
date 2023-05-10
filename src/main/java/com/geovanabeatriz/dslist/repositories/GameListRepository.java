package com.geovanabeatriz.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanabeatriz.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
