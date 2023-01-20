package com.feature.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class SongInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Ranking;
    private int year;
    private String Song;
    private String Artist;
    private String Lyric;

    public SongInfo(int ranking, int year, String song, String artist, String lyric) {
        Ranking = ranking;
        this.year = year;
        Song = song;
        Artist = artist;
        Lyric = lyric;
    }

    public SongInfo() {
        Ranking = 0;
        this.year = 0;
        Song ="";
        Artist = "";
        Lyric = "";
    }

    public int getRanking() {
        return Ranking;
    }

    public void setRanking(int ranking) {
        Ranking = ranking;
    }

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
