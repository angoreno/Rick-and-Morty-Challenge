package com.rickmorty.rmdesafio.dto;

public class RootObjectSchema {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private int episode_Count;
    private OriginObjectSchema origin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisode_Count() {
        return episode_Count;
    }

    public void setEpisode_Count(int episode_Count) {
        this.episode_Count = episode_Count;
    }

    public OriginObjectSchema getOrigin() {
        return origin;
    }

    public void setOrigin(OriginObjectSchema origin) {
        this.origin = origin;
    }
}
