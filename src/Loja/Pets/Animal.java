package Loja.Pets;

import Loja.Loja;

public class Animal {
    private String name;
    private String animalSound;
    private static int numAnimals;
    /*
     * Contrutores
     */

    public Animal(String name, String animalSound) {
        this.name = name;
        this.animalSound = animalSound;
    }
    /*
     * Getters
     */

    public String getName() {
        return name;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public static int getNumAnimals() {
        return numAnimals;
    }

    /*
     * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    public static void setNumAnimals(int numAnimals) {
        Animal.numAnimals = numAnimals;
    }

    /*
     * Methods
     */
    public void animalSound(){
        System.out.println(this.getAnimalSound());
    }
}
