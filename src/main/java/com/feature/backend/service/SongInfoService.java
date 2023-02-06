package com.feature.backend.service;

import com.feature.backend.model.SongInfo;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface SongInfoService {
     public List<SongInfo> getallsonginfo();
     String  findCombinedLyricsByRankIntervalAndYearInterval(int rankStart, int rankEnd, int yearStart, int yearEnd);
}
