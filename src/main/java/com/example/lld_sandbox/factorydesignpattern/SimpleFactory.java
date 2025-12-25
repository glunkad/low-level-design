package com.example.lld_sandbox.factorydesignpattern;

interface Burger {
    void prepare();
}

class BasicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("This is a basic burger");
    }
}

class StandardBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("This is a standard burger");
    }
}

class PremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("This is a premium burger");
    }
}

class BurgerFactor {
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
            System.out.println("Invalid burger type");
            return null;
        }
    }
}

public class SimpleFactory {
    public static void main(String[] args) {
        BurgerFactor burgerFactor = new BurgerFactor();
        Burger burger = burgerFactor.createBurger("basic");
        burger.prepare();
    }
}
