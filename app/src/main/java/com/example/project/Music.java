package com.example.project;
public class Music {
    private String name;
    private String members;
    private String genre;
    private String type;
    public Music(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getMembers() {
        return members;
    }
    public void setMembers(String members) {
        this.members = members;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
