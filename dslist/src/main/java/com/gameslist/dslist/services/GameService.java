package com.gameslist.dslist.services;

import java.util.List;

import com.gameslist.dslist.dto.GameMinDTO;
import com.gameslist.dslist.entitites.Game;
import com.gameslist.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

        }
    }
