package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.repository.Card;
import ru.rosbank.javaschool.repository.CardLevel;

public class CardService {

    public void checkLevel(Card card) {
        if (card.getCardLevel().equals(CardLevel.BLUE)){
            card.setCountBonusPerOneOfThousand(50);
            card.setMinBorderPrice(1);
            card.setMaxBorderPrice(15000);
            if (card.getTotalSum() > card.getMaxBorderPrice()){
                card.setCardLevel(CardLevel.SILVER);
                System.out.println("LevelUp");
            }
        } if (card.getCardLevel().equals(CardLevel.SILVER)) {
            card.setCountBonusPerOneOfThousand(70);
            card.setMinBorderPrice(15001);
            card.setMaxBorderPrice(150000);
            if (card.getTotalSum() > card.getMaxBorderPrice()){
                card.setCardLevel(CardLevel.GOLD);
                System.out.println("LevelUp");
            }
        } if (card.getCardLevel().equals(CardLevel.GOLD)) {
            card.setCountBonusPerOneOfThousand(100);
            card.setMinBorderPrice(150001);
        }
    }

    public void countCalculateBonus(Card card){
        card.setTotalSum(card.getTotalSum() + card.getLastBuy());
        card.setCurrentBonus(card.getLastBuy() / 1000 * card.getCountBonusPerOneOfThousand());
        System.out.println("Current Bonus for card " + card.getCardLevel() + " " + card.getCurrentBonus());
    }


}
