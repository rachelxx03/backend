package com.feature.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "song_info")
public class SongInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int ranking;

    private String Song;
    private String Artist;
    private int year;
    private String Lyric;



    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
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
