package org.example;
/*
 * 6510450429 Thanatus Suwan
 * */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory politeDuckFactory = new PoliteCountFactory();

        simulator.simulate();
        simulator.simulate(duckFactory);
        simulator.simulate(countingDuckFactory);
        simulator.simulate(politeDuckFactory);
    }
    public void simulate() {
        Quackable mallardDuck = new Polite( new QuackCounter( new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new Polite( new PigeonAdapter(new Pigeon()));

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(redheadDuck);

        Flock flock2 = new Flock();
        flock2.add(duckCall);
        flock2.add(rubberDuck);
        flock2.add(goose);
        flock2.add(pigeon);



        System.out.println("\nDuck Simulator ");

        simulate(flock1);
        simulate(flock2);


        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
        System.out.println("The polite " + Polite.getPolite() + " count");
    }

    public void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();

        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() +" times");
        System.out.println("The polite " + Polite.getPolite() + " count");
    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}