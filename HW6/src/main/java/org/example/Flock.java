package org.example;
import java.util.ArrayList;
/*
 * 6510450429 Thanatus Suwan
 * */
public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);

    }
    public void quack() {
        System.out.println("---Flock---");
        if(!quackers.isEmpty()){
            quackers.get(0).quack();
            quackers.get(0).quack();
        }
        for(Quackable q : quackers){
            q.quack();
        }
    }
}
