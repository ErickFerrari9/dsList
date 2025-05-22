package com.gameslist.dslist.repositories;


import com.gameslist.dslist.entitites.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListGameRepository extends JpaRepository<GameList, Long> {
    // JpaRepository already has methods for CRUD operations
    // No need to define any additional methods unless you want custom queries
}
