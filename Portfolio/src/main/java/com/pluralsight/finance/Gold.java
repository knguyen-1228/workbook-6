package com.pluralsight.finance;

public class Gold extends FixedAsset{

    private double weight;

    public Gold(double marketValue, String name, double weight) {
        super(marketValue, name);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        double value = weight * getMarketValue();
        return value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
