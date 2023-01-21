package com.feature.backend.controller;

import com.feature.backend.model.SongInfo;
import com.feature.backend.service.SongInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/songinfo")
@CrossOrigin


public class SongInfoController {
    @Autowired
    private SongInfoService songInfoService;

    @GetMapping("/getAll")
    public List<SongInfo> list(){
        return songInfoService.getallsonginfo();
    }
}
