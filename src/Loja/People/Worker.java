package Loja.People;

import Loja.Loja;
import Loja.Pets.Animal;
import Loja.Pets.AnimalSound;
import Loja.Pets.Cat;
import Loja.Pets.Dog;

public class Worker extends People implements Credit {
    private float salary;
    private float credit;
    private float workedTime;


    /*
     * Contrutores
     */
    public Worker(String name, float salary, float credit,float workedTime) {
        super(name);
        this.salary = salary;
        this.credit = credit;
        this.workedTime = workedTime;
    }

    public Worker(String name, float salary, float credit) {
        super(name);
        this.salary = salary;
        this.credit = credit;
        this.workedTime = 0;
    }
    /*
     * Getters
     */
    public float getCredit() {
        return credit;
    }

    public float getWorkedTime() {
        return workedTime;
    }

    public void setWorkedTime(float workedTime) {
        this.workedTime = workedTime;
    }

    public float getSalary() {
        return salary;
    }

    /*
     * Setters
     */
    public void setCredit(float credit) {
        this.credit = credit;
    }

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
    public static void whatSoundItDoes(Animal animal) {

        if (animal instanceof Cat) {
            ((Cat) animal).animalCatSound();
        }
        else if (animal instanceof Dog) {
            ((Dog) animal).animalDogSound();
        }
        else{
            System.out.println("Elx ta fazendo um som assim oh: ");
            animal.animalSound();
        }
    }
    //***************************Exemplo CASTING*********************************

    //Adota um animal da loja
    @Override
    public void adotarAnimal(Animal animal){
        this.addAnimal(animal);
        this.getAnimals().remove(animal);
        this.setCredit(this.getCredit()+10);//Aumenta o credito de um funcionario
    }

    public void adotarAnimal(String name, String animalSound,boolean isCat,boolean isDog){
        if(isCat){
            this.addAnimal(new Cat(name,"Mauu",true));
        }
        else if (isDog){
            this.addAnimal(new Dog(name, true));
        }
        else{
            this.addAnimal(new Animal(name, animalSound));
        }
    }

    //***************************Exemplo INTERFACE*********************************


    @Override
    public boolean checkCredit() {
        if(this.getCredit() > 100 )
            return true;
        else {
            return false;
        }
    }
    @Override
    public void pedirAumento(){
        if(checkCredit()){
            this.setSalary(this.getSalary()+10);
            System.out.println("O salario aumento para " + getSalary());
        }
        else{
            System.out.println("Precisa ter mais creditos.");
        }
    }
    //***************************Exemplo INTERFACE*********************************

}
