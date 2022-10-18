package me.thribs.app.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.thribs.app.model.Match;

public interface MatchRepository extends MongoRepository<Match, Integer> {
    
}
