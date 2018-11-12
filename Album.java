package com.example.paresh.cardview;

class Album {
    private String name;
    private int numOfSong;
    private int thumbnail;
    private int numOfSongs;


    public Album(String name, int numOfSong, int thumbnail) {
        this.name=name;
        this.numOfSong=numOfSong;
        this.thumbnail=thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }
}
