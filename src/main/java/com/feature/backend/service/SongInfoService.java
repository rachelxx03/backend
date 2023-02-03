package com.feature.backend.service;

import com.feature.backend.model.SongInfo;

import java.util.List;

import com.feature.backend.repository.SongInfoRepository;
import org.springframework.stereotype.Service;


@Service
public interface SongInfoService {

      List<SongInfo> getallsonginfo();
     List<SongInfo> findByYearBetween(int startYear, int endYear);

     String concatLyrics();


    List<SongInfo> findAll();
}
