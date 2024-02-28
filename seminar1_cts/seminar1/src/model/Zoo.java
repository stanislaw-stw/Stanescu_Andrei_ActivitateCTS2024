package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {

    private String name;

    private ZooKeeper zooKeeper;

    private Map<Animal, String> animals;

    public void feedAllAnimals(){

        for(var a : animals.entrySet()) {
            zooKeeper.feedAnimal(a.getKey(), a.getValue());
        }
    }




    public Zoo(String name, ZooKeeper zooKeeper, Map<Animal, String> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public void addAnimal(Animal animal, String food){
        if(animals == null){
            animals = new HashMap<>();
        }

        animals.put(animal, food);
    }
}
