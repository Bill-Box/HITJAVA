package servicee;

import model.Animal;
import model.Bird;
import model.Cat;
import model.Dog;
import servicee.impl.IAnimalServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class IAnimalService implements IAnimalServiceImpl {
    public List<Animal> animals;

    public IAnimalService() {
        animals = new ArrayList<>();
        animals.add(new Dog("Dog1","2"));
        animals.add(new Dog("Dog2", "3"));
        animals.add(new Cat("Meo1", "2"));
        animals.add(new Cat("Meo2", "3"));
        animals.add(new Bird("Bird1", "2"));
    }


    @Override
    public List<Animal> animalsSwimmable(List<Animal> animals) {
        List<Animal> Swimming = new ArrayList<>();
        for( int i = 0; i < animals.size(); i++){
            if(animals.get(i).Swim()){
                Swimming.add(animals.get(i));
            }
        }
        return Swimming;
    }

    @Override
    public List<Animal> animalsFlyable(List<Animal> animals) {
        List<Animal> Flyy = new ArrayList<>();
        for( int i = 0; i < animals.size() ; i++){
            if (animals.get(i).Fly()){
                Flyy.add(animals.get(i));
            }
        }
        return Flyy;
    }

    @Override
    public boolean deteleAnimalsSwimmable(List<Animal> animals) {
        int dem = 0;
        for( int i = 0; i < animals.size() ; i++){
            if (animals.get(i).Swim()){
                animals.remove(animals.get(i));
                dem++;
            }
        }
        if(dem >= 1 ) return true;
        return false;
    }

    @Override
    public boolean deleteAnimalsSwimmableAndFlyable(List<Animal> animals) {
        int dem = 0;
        for( int i = 0; i < animals.size() ; i++){
            if (animals.get(i).Fly() && animals.get(i).Fly()){
                animals.remove(animals.get(i));
                dem++;
            }
        }
        if(dem >= 1 ) return true;
        return false;
    }

//    Kiểm tra và in ra các con vật có thể bơi.
//    Kiểm tra và in ra các con vật có thể bay.
//    Thực hiện xóa những con vật có thể bay.
//    Thực hiện xóa những con vật vừa có thể bay vừa có thể bơi.
}
