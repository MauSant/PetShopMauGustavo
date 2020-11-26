package Loja.Pets;

public class Cat extends Animal {
    private String name;
    private String animalSound;

    /*
     * Contrutores
     */

    public Cat(String name, String nameCat, String animalSound) {
        super(name);
        this.name = nameCat;
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
