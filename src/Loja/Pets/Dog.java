package Loja.Pets;

public class Dog extends Animal {
    private String animalSound;

    /*
     * Contrutores
     */

    public Dog(String name, String animalSound) {
        super(name);
        this.animalSound = animalSound;
    }
    /*
     * Getters
     */



    public String getAnimalSound() {
        return animalSound;
    }
    /*
     * Setters
     */


    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }
    /*
     * Methods
     */
}
