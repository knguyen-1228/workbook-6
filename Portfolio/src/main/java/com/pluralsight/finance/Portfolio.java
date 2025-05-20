package com.pluralsight.finance;

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


    @Override
    public int compareTo(Portfolio o) {
        return 0;
    }
}
