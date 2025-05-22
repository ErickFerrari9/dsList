package com.gameslist.dslist.dto;

import com.gameslist.dslist.entitites.Game;
import com.gameslist.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    private GameMinProjection projection;

    public GameMinDTO() {
    }
    public GameMinDTO(GameMinProjection projection) {
        this.projection = projection;
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public GameMinDTO(Game entity) {
       id = entity.getId();
       title = entity.getTitle();
       year = entity.getYear();
       imgUrl = entity.getImgUrl();
       shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
