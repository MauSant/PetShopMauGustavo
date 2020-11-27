package Loja.Pets;

public class Cat extends Animal {
    private String animalSound;

    /*
     * Contrutores
     */

    public Cat(String name, String animalSound) {
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
