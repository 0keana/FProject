package org.example;

public class Happiness extends Feeling{
    boolean isNice;

    public Happiness(int intensity, boolean isNice) {
        super(intensity);
        this.isNice = isNice;
    }
    public void makeSound() {
        System.out.println("Yeaaahh!!");
    }
}
