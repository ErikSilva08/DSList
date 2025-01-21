package com.erikdev.DSList.repository;

import com.erikdev.DSList.entity.Game;
import com.erikdev.DSList.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
