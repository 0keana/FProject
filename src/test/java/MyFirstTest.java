import org.example.Feeling;
import org.example.Happiness;
import org.example.Love;
import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    void simpleTest(){
        System.out.println("this is my first test ever!");
        Feeling feeling1 = new Happiness(3, true);
        Feeling feeling2 = new Love(5,true);

        feeling1.makeSound();
        feeling2.makeSound();

    }
}
