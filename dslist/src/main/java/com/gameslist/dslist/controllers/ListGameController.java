package com.gameslist.dslist.controllers;

import com.gameslist.dslist.dto.GameDTO;
import com.gameslist.dslist.dto.GameListDTO;
import com.gameslist.dslist.dto.GameMinDTO;
import com.gameslist.dslist.services.GameService;
import com.gameslist.dslist.services.ListGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ListGameController {

    @Autowired
    private ListGameService listGameService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = listGameService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

}
