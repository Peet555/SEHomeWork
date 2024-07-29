package org.example;
/*
 * 6510450429 Thanatus Suwan
 * */
public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}