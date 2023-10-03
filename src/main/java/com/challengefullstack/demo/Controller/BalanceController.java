package com.challengefullstack.demo.Controller;

import com.challengefullstack.demo.Entity.Balance;
import com.challengefullstack.demo.Service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/balance")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://651c06eef480ad1e24cb5d39--challenge-full-stack.netlify.app")

public class BalanceController {
    @Autowired
    BalanceService balanceService;

    @GetMapping("/allBalance")
    public List<Balance> getBalance(){
        return balanceService.getBalance();
    }

    @PostMapping("/insert")
    public Balance insert(@RequestBody Balance balance){
        return balanceService.addBalance(balance);
    }
}
