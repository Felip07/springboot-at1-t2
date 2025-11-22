package com.at1t2.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/games")
public class GameController {

    @GetMapping
    public List<String> getAllGames() {
        return List.of("The Witcher 3", "Dark Souls", "Hollow Knight");
    }

    @GetMapping("/{id}")
    public Map<String, Object> getGameById(@PathVariable int id) {
        return Map.of(
                "id", id,
                "name", "Game " + id
        );
    }

    @PostMapping
    public Map<String, Object> createGame(@RequestBody Map<String, String> body) {
        return Map.of(
                "id", 1,
                "name", body.get("name"),
                "status", "created"
        );
    }
}
