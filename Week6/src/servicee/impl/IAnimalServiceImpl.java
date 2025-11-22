package servicee.impl;

import model.Animal;

import java.util.List;

public interface IAnimalServiceImpl {
    public List<Animal> animalsSwimmable(List<Animal> animals);
    public List<Animal> animalsFlyable(List<Animal> animals);
    public boolean deteleAnimalsSwimmable(List<Animal> animals);
    public boolean deleteAnimalsSwimmableAndFlyable(List<Animal> animals);
}
