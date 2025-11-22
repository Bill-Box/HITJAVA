package model;

import servicee.Swimable;

public  class Dog extends Animal   {
    public Dog(String name, String age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Gau Gua");

    }

    @Override
    public void eat() {
        System.out.println("Cho dang an");

    }

    @Override
    public void move() {
        System.out.println("Cho Dang Chay Chay");

    }
    @Override
    public boolean Swim(){
        return true;
    }

    @Override
    public String display() {
        return String.format("Dog Name: %s Age: %s\n",getName(),getAge());
    }

    @Override
    public boolean Fly() {
        return false;
    }
}
