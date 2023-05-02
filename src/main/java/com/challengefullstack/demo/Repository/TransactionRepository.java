package com.challengefullstack.demo.Repository;

import com.challengefullstack.demo.Entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, Integer> {
}
