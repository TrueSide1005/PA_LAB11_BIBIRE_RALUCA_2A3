package com.example.lab11.Controller;

import com.example.lab11.GameRespository;
import com.example.lab11.repo.PlayersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/players")
public class GameController {
    @Autowired
    GameRespository gameRepo;

    @GetMapping("/allplayers")
    public Iterable<PlayersEntity> index(){
        return gameRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<PlayersEntity> show(@PathVariable String id){
        int playerID = Integer.parseInt(id);
        return gameRepo.findById(playerID);
    }

    @PostMapping("/add")
    public void addPlayer(@RequestBody PlayersEntity player) {
        this.addPlayersEntity(player);
    }

    @PutMapping("/update/{id}")
    public void updatePlayer(@PathVariable String playerID, @RequestBody PlayersEntity player) {
        this.updatePlayersEntity(playerID, player);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePlayer(@PathVariable String playerID) {
        this.deletePlayerEntity(playerID);
    }


    public void addPlayersEntity(PlayersEntity player) {
        gameRepo.save(player);
    }

    public void updatePlayersEntity(String id, PlayersEntity player) {
        gameRepo.save(player);
    }

    public void deletePlayerEntity(String id) {
        gameRepo.deleteById(Integer.valueOf(id));
    }


}
