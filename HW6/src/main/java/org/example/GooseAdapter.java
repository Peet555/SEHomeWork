package org.example;
/*
 * 6510450429 Thanatus Suwan
 * */
public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    public void quack() {
        goose.honk();
    }
}
