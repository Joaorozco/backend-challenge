package com.challengefullstack.demo.Repository;

import com.challengefullstack.demo.Entity.Balance;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BalanceRepository extends MongoRepository<Balance, Integer> {
}
