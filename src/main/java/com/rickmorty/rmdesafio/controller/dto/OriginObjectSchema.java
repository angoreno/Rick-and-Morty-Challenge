package com.rickmorty.rmdesafio.controller.dto;

public class OriginObjectSchema {
    private String name;
    private String url;
    private String dimension;
    private String[] residents;


    public OriginObjectSchema() {
    }

    public OriginObjectSchema(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String[] getResidents() {
        return residents;
    }

    public void setResidents(String[] residents) {
        this.residents = residents;
    }
}
