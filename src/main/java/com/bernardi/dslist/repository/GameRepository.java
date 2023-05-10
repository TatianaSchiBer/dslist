package com.bernardi.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bernardi.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
