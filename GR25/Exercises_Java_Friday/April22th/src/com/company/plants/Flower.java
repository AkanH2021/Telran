package com.company.plants;

public class Flower extends Plant{


    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public int getGrowPerSeason() {
        return 0;
    }

    @Override
    public void doSummer() {

    }

    @Override
    public void doAutumn() {

    }
}
