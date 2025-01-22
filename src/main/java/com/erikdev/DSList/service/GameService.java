package com.erikdev.DSList.service;

import com.erikdev.DSList.entity.Game;
import com.erikdev.DSList.entity.GameDTO;
import com.erikdev.DSList.projections.GameMinProjection;
import com.erikdev.DSList.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    public GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    //buscar todos os games
    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();
    }

    // buscar um game pelo seu id
    public Game findById (Long id) {
        return gameRepository.findById(id).get();
    }

    // buscar game de uma lista
    public List<GameDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameDTO(x)).toList();
    }
}
