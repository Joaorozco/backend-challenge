package com.challengefullstack.demo.Service.Imp;

import com.challengefullstack.demo.Entity.Transaction;
import com.challengefullstack.demo.Repository.TransactionRepository;
import com.challengefullstack.demo.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public List<Transaction> list() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction insert(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
