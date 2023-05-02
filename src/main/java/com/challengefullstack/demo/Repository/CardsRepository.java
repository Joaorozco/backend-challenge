package com.challengefullstack.demo.Repository;

import com.challengefullstack.demo.Entity.Cards;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardsRepository extends MongoRepository<Cards, Integer> {
}
