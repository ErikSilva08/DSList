package com.erikdev.DSList.entity;

import jakarta.persistence.Column;

public class GameDTO {
    private Long id;
    private String title;
    private Integer gameYear;
    private String shortDescription;

    public GameDTO() {
    }

    public GameDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.gameYear = entity.getGameYear();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getGameYear() {
        return gameYear;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
