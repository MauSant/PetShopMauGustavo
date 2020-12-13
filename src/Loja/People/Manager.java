package Loja.People;

import Loja.Pets.Animal;


/*
* Class manager represents the manager of the store.
*/
public class Manager extends People implements Credit{
    private float salary;
    private float credit;

    /*
    * Contrutores
     * @param name it's the name of the manager.
     * @param salary it's the salary of the manager.
     * @param credit it's the credit of the manager.
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

    //***************************Exemplo INTERFACE*********************************

    @Override
    public boolean checkCredit() {
        return this.getCredit() > 50;
    }
    @Override
    public void pedirAumento(){
        if(checkCredit()){
            this.setSalary(this.getSalary()+15);
        }
        else{
            System.out.println("Trabalha menos e recebe mais");
        }
    }
    //***************************Exemplo INTERFACE*********************************
}
