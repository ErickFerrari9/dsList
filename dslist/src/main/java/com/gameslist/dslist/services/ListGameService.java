package com.gameslist.dslist.services;

import com.gameslist.dslist.dto.GameListDTO;
import com.gameslist.dslist.entitites.GameList;
import com.gameslist.dslist.repositories.ListGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ListGameService {

    @Autowired
    private ListGameRepository listGameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = listGameRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
        }
    }
