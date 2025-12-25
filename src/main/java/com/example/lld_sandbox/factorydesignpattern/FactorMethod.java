package com.example.lld_sandbox.factorydesignpattern;

interface Burger {
    void prepare();
}

class BasicBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Basic Burger ready!");
    }
}

class StandardBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Standard Burger ready!");
    }
}

class PremiumBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Premium Burger ready!");
    }
}

class WheatBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Wheat Burger ready!");
    }
}

class StandardWheatBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Standard Wheat Burger ready!");
    }
}

class PremiumWheatBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Premium Wheat Burger ready!");
    }
}

interface BurgerFactory {
    Burger createBurger(String type);
}

class SinghBurger implements BurgerFactory {
    @Override
    public Burger createBurger(String type) {
        if(type.equals("basic")) {
            return new BasicBurger();
        }
        else if(type.equals("standard")) {
            return new StandardBurger();
        }
        else if(type.equals("premium")) {
            return new PremiumBurger();
        }
        else{
            System.out.println("We don't server this burger at SinghBurger");
            return null;
        }
    }
}

class KingBurger implements BurgerFactory {

    @Override
    public Burger createBurger(String type) {
        if(type.equals("basicwheat")) {
            return new WheatBurger();
        }
        else if(type.equals("standardwheat")) {
            return new StandardWheatBurger();
        }
        else if(type.equals("premiumwheat")) {
            return new PremiumWheatBurger();
        }
        else{
            System.out.println("We don't server this burger at KingBurger");
            return null;
        }
    }
}

public class FactorMethod {
    public static void main(String[] args) {
        String type = "basicwheat";

        BurgerFactory factory = new KingBurger();

        Burger burger = factory.createBurger(type);
        burger.prepare();
    }
}
