package com.pluralsight.finance;

import java.util.Collections;
import java.util.List;

public class Portfolio implements Comparable<Portfolio>{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;

    }

    public void addAsset(Valuable asset){
        assets.add(asset);
    }

    public double getValue(){
        double newValue = 0;
        for(Valuable asset : assets){
            newValue += asset.getValue();
        }
        return newValue;
    }

    public Valuable getMostValuable(){
        if(assets.isEmpty()){
            return null;
        }
        Valuable maxAsset = assets.get(0);
        for (Valuable asset : assets){
            if(asset.getValue() > maxAsset.getValue()){
                maxAsset = asset;
            }
        }
        return maxAsset;
    }

    public Valuable getLeastValuable(){
        if(assets.isEmpty()){
            return null;
        }
        Valuable minAsset = assets.get(0);
        for (Valuable asset : assets){
            if(asset.getValue() < minAsset.getValue()){
                minAsset = asset;
            }
        }
        return minAsset;
    }

    @Override
    public int compareTo(Portfolio other) {
        return Double.compare(this.getValue(), other.getValue());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }

    public void setAssets(List<Valuable> assets) {
        this.assets = assets;
    }
}
