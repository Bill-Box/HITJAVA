package model;

public class Bird extends Animal {
    public Bird(String name, String age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Hot Hot");
    }

    @Override
    public void eat() {
        System.out.println("CHim an sau");
    }

    @Override
    public void move() {
        System.out.println("Chim dang bay");
    }

    @Override
    public String display() {
        return String.format("Bird Name: %s Age: %s\n",getName(),getAge());
    }

    @Override
    public boolean Fly() {
        return true;
    }

    @Override
    public boolean Swim() {
        return false;
    }
}
