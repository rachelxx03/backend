package com.feature.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class SongInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int year;
    private String Song;
    private String Artist;
    private String Lyric;



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSong() {
        return Song;
    }

    public void setSong(String song) {
        Song = song;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getLyric() {
        return Lyric;
    }

    public void setLyric(String lyric) {
        Lyric = lyric;
    }


}
