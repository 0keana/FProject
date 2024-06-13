package org.example;
import org.example.Feeling;
public class Love extends Feeling {
    boolean isStrong;

    public Love(int intensity, boolean isStrong) {
        super(intensity);
        this.isStrong = isStrong;
    }
    public void makeSound() {
        System.out.println("Luv u");
    }
}
