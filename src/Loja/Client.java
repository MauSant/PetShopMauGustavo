package Loja;

import Loja.Pets.Animal;

import java.util.ArrayList;

public class Client {
    private String name;
    private float moneyBank;
    private ArrayList<Animal> animals;

    /*
    * Contructors
     */

    //***************************Exemplo SOBRECARGA*********************************

    public Client(String name, float moneyBank) {
        this.name = name;
        this.moneyBank = moneyBank;
        this.animals = new ArrayList<>();
    }

    public Client(String name) {
        this.name = name;
        this.moneyBank = 0;
        this.animals = new ArrayList<>();
    }
    //***************************Exemplo SOBRECARGA*********************************

    /*
    * Getters
     */
    public String getName() {
        return name;
    }

    public float getMoneyBank() {
        return moneyBank;
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

    public void setMoneyBank(float moneyBank) {
        this.moneyBank = moneyBank;
    }

    public void addAnimals(Animal animal) {
        this.animals.add(animal);
    }

    /*
    * Methods
     */
}
