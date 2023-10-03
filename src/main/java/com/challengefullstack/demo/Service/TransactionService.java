package com.challengefullstack.demo.Service;

import com.challengefullstack.demo.Entity.Transaction;

import java.util.List;

public interface TransactionService {
    public List<Transaction> getTransaction();
    public Transaction insert(Transaction transaction);
}
