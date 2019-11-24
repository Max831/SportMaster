package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.model.Card;
import ru.rosbank.javaschool.model.Level;

public class CardService {

    public Enum checkLevel(Card card) {
        int actualTotalSum = card.getTotalSum() + card.getLastBuy();
         if (card.getLevel().equals(Level.NONE)){
            if (actualTotalSum < card.getMaxBorderPrice()) {
                return card.getLevel();
            }
            card.setLevel(Level.BLUE);
            return card.getLevel();
        } else if (card.getLevel().equals(Level.BLUE)){
            if (actualTotalSum < card.getMaxBorderPrice()) {
                return card.getLevel();
            }
            card.setLevel(Level.SILVER);
            return card.getLevel();
        } else if (card.getLevel().equals(Level.SILVER)) {
            if (actualTotalSum < card.getMaxBorderPrice()){
                return card.getLevel();
            }
            card.setLevel(Level.GOLD);
            return card.getLevel();
        } else {
             return card.getLevel();
         }
    }


    public int calculateBonus(Card card){
        card.setCurrentBonus(card.getLastBuy() / 1000 * card.getCountBonusPerOneOfThousand());
        return card.getCurrentBonus();
    }


}
