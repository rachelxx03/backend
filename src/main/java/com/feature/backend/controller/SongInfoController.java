package com.feature.backend.controller;

import com.feature.backend.model.SongInfo;
import com.feature.backend.service.SongInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
//    @CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
//    @PostMapping("/lyrics")
//    public ResponseEntity<String> receiveData(@RequestBody String data) {
//        return new ResponseEntity<>("Success", HttpStatus.OK);
//    }



    @GetMapping("/getAll")
    public List<SongInfo> list(){
        return songInfoService.getallsonginfo();
    }
}
