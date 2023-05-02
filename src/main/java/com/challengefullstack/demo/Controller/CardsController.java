package com.challengefullstack.demo.Controller;

import com.challengefullstack.demo.Entity.Cards;
import com.challengefullstack.demo.Service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://6450f5d745b13b48f7749bc7--challenge-full-stack.netlify.app")
public class CardsController {
    @Autowired
    private CardsService cardsService;

    @GetMapping("/allCards")
    public List<Cards> getCards(){
        return cardsService.getCards();
    }

    @PostMapping("/insert")
    public Cards insert(@RequestBody Cards cards){
        return cardsService.insert(cards);
    }
}
