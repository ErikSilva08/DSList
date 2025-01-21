package com.erikdev.DSList.controller;

import com.erikdev.DSList.entity.GameDTO;
import com.erikdev.DSList.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    public GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameDTO> findAll() {
        List<GameDTO> result = gameService.findAll();
        return result;
    }
}
