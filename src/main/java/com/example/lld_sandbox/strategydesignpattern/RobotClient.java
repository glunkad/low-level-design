package com.example.lld_sandbox.strategydesignpattern;

interface Talkable{
    void talk();
}

class NormalTalk implements Talkable{

    @Override
    public void talk() {
        System.out.println("Can talk");
    }
}

class NoTalk implements Talkable{

    @Override
    public void talk() {
        System.out.println("Can not talk");
    }
}

interface Walkable {
    void walk();
}

class NormalWalk implements Walkable{
    @Override
    public void walk() {
        System.out.println("Can walk");
    }
}

class NoWalk implements Walkable{

    @Override
    public void walk() {
        System.out.println("Can not walk");
    }
}

interface Flyable {
    void fly();
}

class NormalFly implements Flyable{

    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}

class NoFly implements Flyable {

    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}

abstract class Robot {
    private Talkable talkableBehaviour;
    private Walkable walkableBehaviour;
    private Flyable flyableBehaviour;

    public Robot(Talkable talkable, Walkable walkable, Flyable flyable) {
        this.talkableBehaviour = talkable;
        this.walkableBehaviour = walkable;
        this.flyableBehaviour = flyable;
    }

    public void talk() {
        talkableBehaviour.talk();
    }

    public void walk() {
        walkableBehaviour.walk();
    }
    public void fly() {
        flyableBehaviour.fly();
    }

    public abstract void projection();
}

class ComapnionRobot extends Robot {

    public ComapnionRobot(Talkable t, Walkable w, Flyable f) {
        super(t, w, f);
    }

    @Override
    public void projection() {
        System.out.println("Companion Robot features: \n");
    }
}

class WorkerRobot extends Robot {
    public WorkerRobot(Talkable t, Walkable w, Flyable f) {
        super(t, w, f);
    }

    @Override
    public void projection() {
        System.out.println("Worker Robot features: \n");
    }
}

public class RobotClient {
    public static void main(String[] args) {
        Robot robot1 = new ComapnionRobot(new NormalTalk(), new NormalWalk(), new NormalFly());
        robot1.projection();
        robot1.talk();
        robot1.walk();
        robot1.fly();

        System.out.println("----------------------------");

        Robot robot2 = new  WorkerRobot(new NoTalk(), new NoWalk(), new NormalFly());
        robot2.projection();
        robot2.talk();
        robot2.walk();
        robot2.fly();

    }
}
