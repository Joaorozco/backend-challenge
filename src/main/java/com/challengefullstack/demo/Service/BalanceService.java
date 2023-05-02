package com.challengefullstack.demo.Service;

import com.challengefullstack.demo.Entity.Balance;

import java.util.List;

public interface BalanceService {
    public List<Balance> getBalance();
    public Balance addBalance(Balance balance);
}
