package com.feature.backend.service;

import com.feature.backend.model.SongInfo;
import com.feature.backend.repository.SongInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class SongInfoServiceImpl implements SongInfoService{


    @Autowired
    private  SongInfoRepository songInfoRepository;


    public String findLyricsByRankingAndYearBetween(int startYear, int endYear){
        return songInfoRepository.findLyricsByRankingAndYearBetween(startYear,endYear);
    }


}
