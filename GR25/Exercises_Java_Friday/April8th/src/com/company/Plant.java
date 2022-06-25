package com.company;

public abstract class Plant {
    private String name;
    private int age;
    private int height;

    public Plant(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addYearToAge() {
        this.age++;
    }

    public abstract int getGrowPerSeason();

    public void doSpring() {
        addYearToAge();
        setHeight(getHeight()+ getGrowPerSeason());
        System.out.println(getName()+ " has grown in Spring,  " + getHeight());
    }

    public abstract void doSummer();

    public abstract void doAutumn();

    public void doWinter(){
        System.out.println(getName() + " is not growing in WInter, " + getHeight());

    };


}
