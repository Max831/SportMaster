package ru.rosbank.javaschool;

import ru.rosbank.javaschool.model.Card;
import ru.rosbank.javaschool.model.Level;
import ru.rosbank.javaschool.service.CardService;

public class Main {
    public static void main(String[] args) {
        CardService cardService = new CardService();

        Card card1 = new Card(Level.BLUE, 10000, 2000);
        cardService.checkLevel(card1);
        cardService.calculateBonus(card1);

        Card card2 = new Card(Level.BLUE, 10000, 5002);
        cardService.checkLevel(card2);
        cardService.calculateBonus(card2);

        Card card3 = new Card(Level.BLUE, 15003, 3000);
        cardService.checkLevel(card3);
        cardService.calculateBonus(card3);

        Card card4 = new Card(Level.SILVER, 200000, 4000);
        cardService.checkLevel(card4);
        cardService.calculateBonus(card4);

        Card card5 = new Card(Level.GOLD, 1022200, 6000);
        cardService.checkLevel(card5);
        cardService.calculateBonus(card5);
    }
}
