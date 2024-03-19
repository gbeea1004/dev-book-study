package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._10_strategy.practice;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._10_strategy.example.Hand;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._10_strategy.example.Strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {

    private Random random;

    public RandomStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
