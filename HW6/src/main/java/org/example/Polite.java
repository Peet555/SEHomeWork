package org.example;

public class Polite implements Quackable {
    Quackable duck;
    private static int numberOfPolite;

    public  Polite (Quackable duck) {
        this.duck = duck;
    }


    @Override
    public void quack() {
        duck.quack();
        System.out.println("      Kub");
        numberOfPolite++;
    }

    public static int getPolite() {
        return numberOfPolite;
    }
}
