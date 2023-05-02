package com.challengefullstack.demo.Service;

import com.challengefullstack.demo.Entity.Transaction;

import java.util.List;

public interface TransactionService {
    public List<Transaction> list();
    public Transaction insert(Transaction transaction);
}