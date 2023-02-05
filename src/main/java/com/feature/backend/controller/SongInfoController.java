package com.feature.backend.controller;

import com.feature.backend.model.SongInfo;
import com.feature.backend.service.SongInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/songinfo")
@CrossOrigin
public class SongInfoController {
    @Autowired
    private SongInfoService songInfoService;
    @GetMapping("/getDecade")
    public String[][] list1(){
        String[][] sortedData = new String[4][4];
        int year = 1970;
        for(int i = 0 ; i < 4 ;i++){
            int rank = 0 ;
            for(int j = 0 ; j < 4 ;j++){
//                sortedData[i][j] = songInfoService.findLyricsByRankingAndYearBetween(year,year+10,rank,rank+25);
                rank+=25;

            }
            year+=10;

        }
        return  sortedData;


    }


}
