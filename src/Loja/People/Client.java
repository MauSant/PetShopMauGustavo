package Loja.People;

import Loja.Pets.Animal;
import Loja.Pets.Dog;
import Loja.Pets.Cat;
import Loja.Pets.AnimalSound;


import java.util.ArrayList;

public class Client extends People{
    private float moneyBank;

    /*
    * Contructors
     */
    //***************************Exemplo SOBRECARGA*********************************

    public Client(String name, float moneyBank) {
        super(name);
        this.moneyBank = moneyBank;
    }

    public Client(String name) {
        super(name);
        this.moneyBank = 0;
    }
    //***************************Exemplo SOBRECARGA*********************************

    /*
    * Getters
     */
    public float getMoneyBank() {
        return moneyBank;
    }


    /*
    * Setters
     */
    public void setMoneyBank(float moneyBank) {
        this.moneyBank = moneyBank;
    }

    public void addAnimal(Animal animal) {
        this.getAnimals().add(animal);
    }

    /*
    * Methods
    */
    //***************************Exemplo SOBRECARGA*********************************
    //Adopting a animal that is from the Store
    public void adotarAnimal(Animal animal){
        this.addAnimal(animal);
        this.getAnimals().remove(animal);
    }

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
