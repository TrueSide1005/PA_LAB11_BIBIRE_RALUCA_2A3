package com.example.lab11;

import com.example.lab11.repo.PlayersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRespository extends CrudRepository<PlayersEntity, Integer> {


 }