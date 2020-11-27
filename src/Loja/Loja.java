package Loja;

import Loja.Pets.Animal;

import java.util.ArrayList;

public class Loja {
    private String name;
    private ArrayList<Worker> workers;
    private ArrayList<Animal> animals;

    /*
     * Contrutores
     */

    public Loja(String name) {
        this.name = name;
        this.workers= new ArrayList<>();
        this.animals = new ArrayList<>();
    }
    /*
     * Getters
     */

    public String getName() {
        return name;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
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

    public void addWorkers(Worker worker) {
        this.workers.add(worker);
    }

    public void addAnimals(Animal animal) {
        this.animals.add(animal);
    }


    /*
     * Methods
     */

}
