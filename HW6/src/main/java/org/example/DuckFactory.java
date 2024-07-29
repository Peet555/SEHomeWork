package org.example;
/*
 * 6510450429 Thanatus Suwan
 * */
public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
    public Quackable createDuckCall() {
        return new DuckCall();
    }
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
