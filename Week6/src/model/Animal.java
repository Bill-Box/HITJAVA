package model;

import servicee.Flyable;
import servicee.Swimable;

public abstract class Animal implements Flyable, Swimable {
    protected String name;
    protected String age;

    public Animal() {
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
      abstract  public  void makeSound();
    abstract  public void eat();
    abstract public void move();
    abstract public String display();

    @Override
    public String toString() {
        return "Animal " +
                "name='" + name + " " +
                ", age='" + age + " ";
    }
}
