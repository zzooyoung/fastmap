package com.example.fastmap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MMapController {

    @Autowired
    private MMapService mMapService;

    @GetMapping("/mmap")
    public List<Mmap> getAllMMapData() {
        return mMapService.getAllMMapData();
    }

}