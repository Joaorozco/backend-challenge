package com.challengefullstack.demo.Service.Imp;

import com.challengefullstack.demo.Entity.Balance;
import com.challengefullstack.demo.Repository.BalanceRepository;
import com.challengefullstack.demo.Service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceServiceImpl implements BalanceService {
    @Autowired(required = true)
    BalanceRepository balanceRepository;
    @Override
    public List<Balance> getBalance() {
        return balanceRepository.findAll();
    }

    @Override
    public Balance addBalance(Balance balance){
        return balanceRepository.save(balance);
    }
}
