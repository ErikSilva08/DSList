package com.erikdev.DSList.repository;

import com.erikdev.DSList.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
