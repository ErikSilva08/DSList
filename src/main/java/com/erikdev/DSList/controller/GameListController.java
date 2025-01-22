package com.erikdev.DSList.controller;

import com.erikdev.DSList.entity.GameDTO;
import com.erikdev.DSList.entity.GameList;
import com.erikdev.DSList.service.GameListService;
import com.erikdev.DSList.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Lists")
public class GameListController {

    public GameService gameService;

    public GameListService gameListService;

    public GameListController(GameService gameService, GameListService gameListService) {
        this.gameService = gameService;
        this.gameListService = gameListService;
    }

    // buscar todas as listas
    @GetMapping
    public List<GameList> findAll() {
        return gameListService.findAll();
    }

    // buscar games de uma determinada lista
    @GetMapping("/{listId}/games")
    public List<GameDTO> findbyList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
