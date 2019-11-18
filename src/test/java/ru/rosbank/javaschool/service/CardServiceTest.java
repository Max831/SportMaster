package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.repository.Card;
import ru.rosbank.javaschool.repository.CardLevel;

import static org.junit.jupiter.api.Assertions.*;

class CardServiceTest {

    CardService cardService = new CardService();

    Card cardholder1 = new Card(CardLevel.BLUE, 10000, 2000);

    Card cardholder2 = new Card(CardLevel.BLUE, 10000, 5002);

    Card cardholder3 = new Card(CardLevel.BLUE, 15003, 3000);

    Card cardholder4 = new Card(CardLevel.SILVER, 200000, 4000);

    Card cardholder5 = new Card(CardLevel.GOLD, 1022200, 6000);


        @Test
        void check() {
            cardService.checkLevel(cardholder1);
            cardService.countCalculateBonus(cardholder1);
            cardService.checkLevel(cardholder2);
            cardService.countCalculateBonus(cardholder2);
            cardService.checkLevel(cardholder3);
            cardService.countCalculateBonus(cardholder3);
            cardService.checkLevel(cardholder4);
            cardService.countCalculateBonus(cardholder4);
            cardService.checkLevel(cardholder5);
            cardService.countCalculateBonus(cardholder5);
        }
    @Test
    void checkLevel() {
    }

    @Test
    void countCalculateBonus() {
    }
}