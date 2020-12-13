package Loja.People;

import Loja.Loja;
import Loja.Pets.Animal;
import Loja.Pets.AnimalSound;
import Loja.Pets.Cat;
import Loja.Pets.Dog;

public class Worker extends People {
    private float salary;
    private float credit;


    /*
     * Contrutores
     */
    public Worker(String name, float salary, float credit) {
        super(name);
        this.salary = salary;
        this.credit = credit;
    }
    /*
     * Getters
     */



    public float getSalary() {
        return salary;
    }
    /*
     * Setters
     */


    public void addAnimal(Animal animal) {
        this.getAnimals().add(animal);
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    /*
     * Methods
     */

    //***************************Exemplo CASTING*********************************
    //Metodo para ouvir de um cliente qual som o animal dele está fazendo
    public void whatSoundItDoes(Animal animal, String sound) {
        if (sound != null) {
            System.out.println("Elx ta fazendo um som assim oh: " + sound);
        } else if (sound == "like a cat") {
            ((Cat) animal).animalSound();
        } else if (sound == "like a dog") {
            ((Dog) animal).animalSound();
        }
    }
    //***************************Exemplo CASTING*********************************

    public void adotarAnimal(Animal animal){
        this.addAnimal(animal);
        this.getAnimals().remove(animal);
    }
}
