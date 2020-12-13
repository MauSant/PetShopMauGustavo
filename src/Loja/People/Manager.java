package Loja.People;

import Loja.Pets.Animal;

public class Manager extends People{
    private float salary;
    private float credit;

    /*
    * Contrutores
    */
    public Manager(String name, float salary, float credit) {
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

    public float getCredit() {
        return credit;
    }

    /*
    * Setters
     */

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public void addAnimal(Animal animal) {
        this.getAnimals().add(animal);
    }


    /*
    * Metodos
     */

    @Override
    public void adotarAnimal(Animal animal){
        this.addAnimal(animal);
        this.getAnimals().remove(animal);
        this.setCredit(this.getCredit()+10); //Aumenta o credito de um funcionario
    }
}
