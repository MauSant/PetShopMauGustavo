package Loja.People;

import Loja.Pets.Animal;

import java.util.ArrayList;

public abstract class People {
    private String name;
    private ArrayList<Animal> animals;

    /*
    * Contrutor
     */
    public People(String name) {
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

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    /*
    * Metodos
     */
    public abstract void adotarAnimal(Animal animal);

    //***************************Exemplo INSTACEOF*********************************
    public void makeCard(People people) {
        if (people instanceof Client) {
            System.out.println("Fazer cartão de cliente");
        }
        else if (people instanceof Manager) {
            System.out.println("Fazer cartão de Gerente");
        }
        else if (people instanceof Worker) {
            System.out.println("Fazer cartão de Trabalhador");
        }
        else{
            System.out.println("Isto não é uma pessoa");
        }
    }
        //***************************Exemplo INSTACEOF*********************************
}