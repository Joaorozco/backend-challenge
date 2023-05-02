package com.challengefullstack.demo.Service.Imp;

import com.challengefullstack.demo.Entity.Cards;
import com.challengefullstack.demo.Repository.CardsRepository;
import com.challengefullstack.demo.Service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardsServiceImpl implements CardsService {
    @Autowired
    CardsRepository cardsRepository;

    @Override
    public List<Cards> getCards() {
        return cardsRepository.findAll();
    }

    @Override
    public Cards insert(Cards card) {
        return cardsRepository.save(card);
    }
}
