package com.feature.backend.controller;
import com.feature.backend.model.SongInfo;
import com.feature.backend.service.SongInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/songinfo")

public class SongInfoController {
    @Autowired
    private SongInfoService songInfoService;



    @GetMapping("/getAll")
    public List<SongInfo> list(){
        return songInfoService.findAll();
    }

    @GetMapping("/getAllString")
    public String list3(){
        return songInfoService.concatLyrics();
    }

    @GetMapping("/getDecade")
    public Map<String, List<SongInfo>> list1(){

//            List<SongInfo> songInfos = songInfoService.findByYearBetween(1980, 1990);
            Map<String, List<SongInfo>> decades = new HashMap<>();
//            decades.put("1970s", new ArrayList<>());
//            decades.put("1980s", new ArrayList<>());
//            decades.put("1990s", new ArrayList<>());
//            decades.put("2000s", new ArrayList<>());
//            for (SongInfo songInfo : songInfos) {
//                int decade = songInfo.getYear() - (songInfo.getYear() % 10);
//                if (decade >= 1970 && decade < 1980) {
//                    decades.get("1970s").add(songInfo);
//                } else if (decade >= 1980 && decade < 1990) {
//                    decades.get("1980s").add(songInfo);
//                } else if (decade >= 1990 && decade < 2000) {
//                    decades.get("1990s").add(songInfo);
//                }else if (decade >= 2000) {
//                    decades.get("2000s").add(songInfo);
//                }
//
//            }
            return decades;
        }





}
