package Loja.People;

import Loja.Loja;
import Loja.Pets.Animal;
import Loja.Pets.AnimalSound;
import Loja.Pets.Cat;
import Loja.Pets.Dog;

public class Worker {
    private String name;
    private String job;
    private float salary;

    /*
     * Contrutores
     */

    public Worker(String name, String job, float salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    /*
     * Getters
     */

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public float getSalary() {
        return salary;
    }
    /*
     * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
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
}
