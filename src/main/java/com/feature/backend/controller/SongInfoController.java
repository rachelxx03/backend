package com.feature.backend.controller;

import com.feature.backend.service.SongInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/songinfo")

public class SongInfoController {
    @Autowired
    private SongInfoService songInfoService;


    @PostMapping("/lyrics")
    public void saveLyrics(@RequestBody Lyrics lyrics) {
        // save the lyrics to a database or do something else
        System.out.println(lyrics.getLyrics());
    }

    @GetMapping("/getAll")
    public String[][] GetDataFromEachCenturyAndRankInterval(){
        String[][] SortedData = new String[4][4];
        int year = 1970;
        for(int i=0 ; i <4 ; i++){
            int rank = 0 ;
            for(int j=0 ; j <4 ; j++){
                SortedData[i][j]= songInfoService.findCombinedLyricsByRankIntervalAndYearInterval(rank,rank+24,year,year+9);
                rank+=25;
            }
            year+=10;
        }
        return SortedData;

    }
}
