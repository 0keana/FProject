package org.example;

public abstract class Feeling {
    int intensity;

    public Feeling(int intensity) {
        this.intensity = intensity;
    }
    public abstract void makeSound();
}
