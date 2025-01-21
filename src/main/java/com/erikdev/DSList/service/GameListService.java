package com.erikdev.DSList.service;

import com.erikdev.DSList.entity.Game;
import com.erikdev.DSList.entity.GameDTO;
import com.erikdev.DSList.entity.GameList;
import com.erikdev.DSList.repository.GameListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {
    public GameListRepository gameListRepository;

    public GameListService(GameListRepository gameRepository) {
        this.gameListRepository = gameRepository;
    }

    public List<GameList> findAll() {
        return gameListRepository.findAll();
    }


}
