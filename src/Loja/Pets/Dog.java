package Loja.Pets;

public class Dog extends Animal {

    /*
     * Contrutores
     */

    public Dog(String name, String animalSound) {
        super(name,animalSound);
    }
    /*
     * Getters
     */




    /*
     * Setters
     */



    /*
     * Methods
     */

    public void animalSound(){
        System.out.println(AnimalSound.DOG.getSound());
    }
}
