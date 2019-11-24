package ru.rosbank.javaschool.model;

public class Card {
    private Level level;
    private int totalSum;
    private int lastBuy;
    private int countBonusPerOneOfThousand;
    private int minBorderPrice;
    private int maxBorderPrice;
    private int currentBonus;

    public Card(Level level, int totalSum, int lastBuy) {
        this.level = level;
        this.totalSum = totalSum;
        this.lastBuy = lastBuy;
        switch (this.level) {
            case BLUE:
                this.maxBorderPrice = 15000;
                this.minBorderPrice = 1;
                this.countBonusPerOneOfThousand = 50;
                break;
            case SILVER:
                this.maxBorderPrice = 150000;
                this.minBorderPrice = 15001;
                this.countBonusPerOneOfThousand = 70;
                break;
            case GOLD:
                this.minBorderPrice = 150001;
                this.countBonusPerOneOfThousand = 100;
                break;
            default:
                this.maxBorderPrice = 1;
                this.minBorderPrice = 0;
                this.countBonusPerOneOfThousand = 0;
                break;
        }
    }

    public Enum getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public int getLastBuy() {
        return lastBuy;
    }

    public void setLastBuy(int lastBuy) {
        this.lastBuy = lastBuy;
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
