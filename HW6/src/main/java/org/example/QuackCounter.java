package org.example;
/*
 * 6510450429 Thanatus Suwan
 * */
public class QuackCounter implements Quackable {
    Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
