package com.challengefullstack.demo.Service;

import com.challengefullstack.demo.Entity.Cards;

import java.util.List;

public interface CardsService {
    public List<Cards> getCards();
    public Cards insert(Cards card);
}
