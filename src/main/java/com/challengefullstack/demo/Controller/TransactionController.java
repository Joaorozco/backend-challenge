package com.challengefullstack.demo.Controller;

import com.challengefullstack.demo.Entity.Transaction;
import com.challengefullstack.demo.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transaction")
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://6450f5d745b13b48f7749bc7--challenge-full-stack.netlify.app")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping("/allTransaction")
    public List<Transaction> list(){
        return transactionService.list();
    }

    @PostMapping("/insert")
    public Transaction insert(@RequestBody Transaction transaction){
        return transactionService.insert(transaction);
    }
}
