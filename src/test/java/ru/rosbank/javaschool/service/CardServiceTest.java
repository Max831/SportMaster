package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.model.Card;
import ru.rosbank.javaschool.model.Level;
import static org.junit.jupiter.api.Assertions.*;

class CardServiceTest {

    @Test
    void checkNoneLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.NONE, 0, 0);
        cardService.checkLevel(card);
        assertEquals(Level.NONE, card.getLevel());
    }

    @Test
    void checkBlueLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.BLUE, 10000, 2000);
        cardService.checkLevel(card);
        assertEquals(Level.BLUE, card.getLevel());
    }

    @Test
    void checkSilverLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.SILVER, 18000, 8000);
        cardService.checkLevel(card);
        assertEquals(Level.SILVER, card.getLevel());
    }

    @Test
    void checkGoldLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.GOLD, 180000, 8000);
        cardService.checkLevel(card);
        assertEquals(Level.GOLD, card.getLevel());
    }
    @Test
    void checkUpBlueLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.NONE, 0, 200);
        cardService.checkLevel(card);
        assertEquals(Level.BLUE, card.getLevel());
    }
    @Test
    void checkUpSilverLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.BLUE, 10000, 6000);
        cardService.checkLevel(card);
        assertEquals(Level.SILVER, card.getLevel());
    }

    @Test
    void checkUpGoldLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.SILVER, 140000, 20000);
        cardService.checkLevel(card);
        assertEquals(Level.GOLD, card.getLevel());
    }

    @Test
    void checkBonusNoneLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.NONE, 0, 20000);
        cardService.calculateBonus(card);
        assertEquals(0,card.getCurrentBonus());
    }
    @Test
    void checkBonusBlueLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.BLUE, 10000, 2000);
        cardService.calculateBonus(card);
        assertEquals(100,card.getCurrentBonus());
    }

    @Test
    void checkBonusSilverLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.SILVER, 40000, 20000);
        cardService.calculateBonus(card);
        assertEquals(1400,card.getCurrentBonus());
    }

    @Test
    void checkBonusGoldLevel() {
        CardService cardService = new CardService();
        Card card = new Card(Level.GOLD, 160000, 20000);
        cardService.calculateBonus(card);
        assertEquals(2000,card.getCurrentBonus());
    }

}