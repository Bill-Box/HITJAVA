package model;

import java.sql.SQLOutput;

public class Cat extends Animal{
    public Cat(String name, String age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meo Meo");

    }

    @Override
    public void eat() {
        System.out.println("Meo an ca");
    }

    @Override
    public void move() {
        System.out.println("Meo dang chay");
    }


    @Override
    public String display() {
        return String.format("Meo Name: %s Age: %s\n",getName(),getAge());
    }

    @Override
    public boolean Fly() {
        return false;
    }

    @Override
    public boolean Swim() {
        return false;
    }
}
