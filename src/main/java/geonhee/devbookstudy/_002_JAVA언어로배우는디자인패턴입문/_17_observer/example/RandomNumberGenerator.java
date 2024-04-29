package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._17_observer.example;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
