package Loja.Pets;

public class Dog extends Animal {
    private String name;
    private String animalSound;

    /*
     * Contrutores
     */

    public Dog(String name, String nameDog, String animalSound) {
        super(name);
        this.name = nameDog;
        this.animalSound = animalSound;
    }
    /*
     * Getters
     */

    @Override
    public String getName() {
        return name;
    }

    public String getAnimalSound() {
        return animalSound;
    }
    /*
     * Setters
     */

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }
    /*
     * Methods
     */
}
