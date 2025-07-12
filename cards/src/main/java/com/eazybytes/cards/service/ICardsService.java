package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;
import com.eazybytes.cards.entity.Cards;

import java.util.Optional;

public interface ICardsService {

    void createCard(String mobileNumber);
}
