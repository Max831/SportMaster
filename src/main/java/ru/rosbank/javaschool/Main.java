package ru.rosbank.javaschool;

import ru.rosbank.javaschool.repository.Card;
import ru.rosbank.javaschool.repository.CardLevel;
import ru.rosbank.javaschool.service.CardService;

public class Main {
    public static void main(String[] args) {
        CardService cardService = new CardService();

        Card cardholder1 = new Card(CardLevel.BLUE, 10000, 2000);
        cardService.checkLevel(cardholder1);
        cardService.countCalculateBonus(cardholder1);

        Card cardholder2 = new Card(CardLevel.BLUE, 10000, 5002);
        cardService.checkLevel(cardholder2);
        cardService.countCalculateBonus(cardholder2);

        Card cardholder3 = new Card(CardLevel.BLUE, 15003, 3000);
        cardService.checkLevel(cardholder3);
        cardService.countCalculateBonus(cardholder3);

        Card cardholder4 = new Card(CardLevel.SILVER, 200000, 4000);
        cardService.checkLevel(cardholder4);
        cardService.countCalculateBonus(cardholder4);

        Card cardholder5 = new Card(CardLevel.GOLD, 1022200, 6000);
        cardService.checkLevel(cardholder5);
        cardService.countCalculateBonus(cardholder5);
    }
}
