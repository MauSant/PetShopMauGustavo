package Loja;

import Loja.Pets.Animal;

import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<Animal> animals;

    /*
    * Contructors
     */

    public Client(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    /*
    * Getters
     */
    public String getName() {
        return name;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    /*
    * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void addAnimals(Animal animal) {
        this.animals.add(animal);
    }

    /*
    * Methods
     */
}
