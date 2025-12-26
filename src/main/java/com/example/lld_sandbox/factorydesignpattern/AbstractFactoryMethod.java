package com.example.lld_sandbox.factorydesignpattern;

interface Burger {
    void prepare();
}

class BasicBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Basic Burger prepared!");
    }
}

class StandardBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Standard Burger prepared!");
    }
}

class PremiumBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Premium Burger prepared!");
    }
}

class BasicWheatBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Basic WheatBurger prepared!");
    }
}

class  StandardWheatBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Standard WheatBurger prepared!");
    }
}

class PremiumWheatBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Premium WheatBurger prepared!");
    }
}

interface GarlicBread {
    void prepare();
}

class BasicGarlicBread implements GarlicBread{
    @Override
    public void prepare() {
        System.out.println("Basic GarlicBread prepared!");
    }
}

class StandardGarlicBread implements GarlicBread{

    @Override
    public void prepare() {
        System.out.println("Standard GarlicBread prepared!");
    }
}

class PremiumGarlicBread implements GarlicBread{

    @Override
    public void prepare() {
        System.out.println("Premium GralicBread prepared!");
    }
}

class BasicWheatGarlicBread implements GarlicBread{

    @Override
    public void prepare() {
        System.out.println("Basic WheatGarlicBread prepared!");
    }
}

class StandardWheatGarlicBread implements GarlicBread{

    @Override
    public void prepare() {
        System.out.println("Standard WheatGarlicBread prepared!");
    }
}

class PremiumWheatGarlicBread implements GarlicBread{

    @Override
    public void prepare() {
        System.out.println("Premium WheatGarlicBread prepared!");
    }
}

interface BurgerFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicBread(String type);
}

class SinghBurger implements BurgerFactory{

    @Override
    public Burger createBurger(String type) {
        if(type.equals("basic")){
            return new BasicBurger();
        }
        else if(type.equals("standard")){
            return new StandardBurger();
        }
        else if(type.equals("premium")){
            return new PremiumBurger();
        }
        else{
            System.out.println("We do not have this type of Burger");
            return null;
        }
    }

    @Override
    public GarlicBread createGarlicBread(String type) {
        if(type.equals("basic")){
            return new BasicGarlicBread();
        }
        else if(type.equals("standard")){
            return new StandardGarlicBread();
        }
        else if(type.equals("premium")){
            return new PremiumGarlicBread();
        }
        else{
            System.out.println("We do not have this type of Garlic bread");
            return null;
        }
    }
}

class KingBurger implements BurgerFactory{

    @Override
    public Burger createBurger(String type) {
        if(type.equalsIgnoreCase("basic")){
            return new BasicWheatBurger();
        }
        else if(type.equalsIgnoreCase("standard")) {
            return new StandardWheatBurger();
        }
        else if(type.equalsIgnoreCase("premium")) {
            return new PremiumWheatBurger();
        }
        else {
            System.out.println("We do not have this type of Burger");
            return null;
        }
    }

    @Override
    public GarlicBread createGarlicBread(String type) {
        if(type.equalsIgnoreCase("basic")){
            return new BasicWheatGarlicBread();
        }
        else if(type.equalsIgnoreCase("standard")) {
            return new StandardWheatGarlicBread();
        }
        else if(type.equalsIgnoreCase("premium")) {
            return new PremiumWheatGarlicBread();
        }
        else{
            System.out.println("We do not have this type of Garlic bread");
            return null;
        }
    }
}

public class AbstractFactoryMethod {
    public static void main(String[] args) {
        String type = "basic";

        BurgerFactory burger = new SinghBurger();

        Burger burger1 = burger.createBurger(type);
        burger1.prepare();

        GarlicBread  garlicBread1 = burger.createGarlicBread(type);
        garlicBread1.prepare();

    }
}
