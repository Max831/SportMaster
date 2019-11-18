package ru.rosbank.javaschool.repository;

public class Card {
    private CardLevel cardLevel;
    private long totalSum;
    private int lastBuy;
    private int totalBonus;
    private int countBonusPerOneOfThousand;
    private int minBorderPrice;
    private int maxBorderPrice;
    private int currentBonus;

    public Card(CardLevel cardLevel, long totalSum, int lastBuy) {
        this.cardLevel = cardLevel;
        this.totalSum = totalSum;
        this.lastBuy = lastBuy;
    }

    public Enum getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(CardLevel cardLevel) {
        this.cardLevel = cardLevel;
    }

    public long getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(long totalSum) {
        this.totalSum = totalSum;
    }

    public int getLastBuy() {
        return lastBuy;
    }

    public void setLastBuy(int lastBuy) {
        this.lastBuy = lastBuy;
    }

    public int getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(int totalBonus) {
        this.totalBonus = totalBonus;
    }

    public int getCountBonusPerOneOfThousand() {
        return countBonusPerOneOfThousand;
    }

    public void setCountBonusPerOneOfThousand(int countBonusPerOneOfThousand) {
        this.countBonusPerOneOfThousand = countBonusPerOneOfThousand;
    }

    public int getMinBorderPrice() {
        return minBorderPrice;
    }

    public void setMinBorderPrice(int minBorderPrice) {
        this.minBorderPrice = minBorderPrice;
    }

    public int getCurrentBonus() {
        return currentBonus;
    }

    public void setCurrentBonus(int currentBonus) {
        this.currentBonus = currentBonus;
    }

    public int getMaxBorderPrice() {
        return maxBorderPrice;
    }

    public void setMaxBorderPrice(int maxBorderPrice) {
        this.maxBorderPrice = maxBorderPrice;
    }
}
