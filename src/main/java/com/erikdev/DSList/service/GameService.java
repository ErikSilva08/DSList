package com.erikdev.DSList.service;

import com.erikdev.DSList.entity.Game;
import com.erikdev.DSList.entity.GameDTO;
import com.erikdev.DSList.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    public GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();
    }
}
