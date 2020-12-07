package Loja.People;

import Loja.Pets.Animal;
import Loja.Pets.Dog;
import Loja.Pets.Cat;
import Loja.Pets.AnimalSound;


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

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    /*
    * Methods
    */
    //***************************Exemplo SOBRECARGA*********************************
        //***************************Exemplo INSTANCE OF*********************************
    //Adopting a animal that is from the Store
    public void adotarAnimal(Animal animal){
        if(animal instanceof Cat){
            this.addAnimal(new Cat(animal.getName(), AnimalSound.CAT.getSound()));
        }
        else if(animal instanceof Dog){
            this.addAnimal(new Dog(animal.getName(), AnimalSound.DOG.getSound()));
        }
        else{
            this.addAnimal(animal);
        }
    }
        //***************************Exemplo INSTANCE OF*********************************

    //Adopting a animal that is not from the Store
    public void adotarAnimal(String name, String animalSound,boolean isCat,boolean isDog){
        if(isCat){
            this.addAnimal(new Cat(name, AnimalSound.DOG.getSound()));
        }
        else if (isDog){
            this.addAnimal(new Dog(name, AnimalSound.CAT.getSound()));
        }
        else{
            this.addAnimal(new Animal(name, animalSound));
        }
    }
    //***************************Exemplo SOBRECARGA*********************************

}
