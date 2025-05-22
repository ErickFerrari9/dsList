package com.gameslist.dslist.dto;

import com.gameslist.dslist.entitites.GameList;

public class GameListDTO {

    private long id;
    private String name;

    public GameListDTO() {
    }
    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
