package com.erikdev.DSList.controller;

import com.erikdev.DSList.entity.GameList;
import com.erikdev.DSList.service.GameListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Lists")
public class GameListController {

    public GameListService gameListService;

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping
    public List<GameList> findAll() {
        return gameListService.findAll();
    }
}
