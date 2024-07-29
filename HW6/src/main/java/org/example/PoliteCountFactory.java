package org.example;
/*
 * 6510450429 Thanatus Suwan
 * */
public class PoliteCountFactory extends AbstractDuckFactory{
    public Quackable createMallardDuck() {
        return new Polite(new QuackCounter(new MallardDuck()));
    }
    public Quackable createRedheadDuck() {
        return new Polite(new QuackCounter(new RedheadDuck()));
    }
    public Quackable createDuckCall() {
        return new Polite(new QuackCounter(new DuckCall()));
    }
    public Quackable createRubberDuck() {
        return new Polite(new QuackCounter(new RubberDuck()));
    }
}
