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
    @Override
    public List<SongInfo> getallsonginfo() {
        return songInfoRepository.findAll();
    }

    @Override
    public List<SongInfo> findByYearBetween(int startYear, int endYear) {
        return songInfoRepository.findByYearBetween(startYear,endYear);
    }

    @Override
    public String concatLyrics(){
        return  songInfoRepository.concatLyrics();

    }

    @Override
    public List<SongInfo> findAll() {
       return songInfoRepository.findAll();
    }

}
