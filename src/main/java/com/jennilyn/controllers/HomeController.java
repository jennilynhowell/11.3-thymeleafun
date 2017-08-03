package com.jennilyn.controllers;

import com.jennilyn.models.Playlist;
import com.jennilyn.repositories.PlaylistRepository;
import com.jennilyn.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    PlaylistRepository playlistRepo;

    @Autowired
    SongRepository songRepo;

    @RequestMapping("/")
    public String index(){
        Iterable<Playlist> playlists = playlistRepo.findAll();
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}
