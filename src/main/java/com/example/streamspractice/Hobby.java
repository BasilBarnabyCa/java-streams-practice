package com.example.streamspractice;

public class Hobby {
    private String name;
    private int years;
    private Tier tier;

    public Hobby(String name, int years, Tier tier) {
        setName(name);
        setYears(years);
        setTier(tier);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }
}
