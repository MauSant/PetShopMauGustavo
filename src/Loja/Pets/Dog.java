package Loja.Pets;

public class Dog extends Animal {
    private String animalSound;
    private boolean lovesBones;
    private static int numDogs;
    /*
     * Contrutores
     */

    public Dog(String name, String animalSound) {
        super(name,animalSound);
        this.animalSound = AnimalSound.DOG.getSound();
    }

    public Dog(String name, String animalSound, boolean lovesBones) {
        super(name,animalSound);
        this.lovesBones = lovesBones;
        this.animalSound = AnimalSound.DOG.getSound();
    }
    /*
     * Getters
     */

    @Override
    public String getAnimalSound() {
        return animalSound;
    }

    public boolean isLovesBones() {
        return lovesBones;
    }

    public static int getNumDogs() {
        return numDogs;
    }
    /*
     * Setters
     */

    @Override
    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    public void setLovesBones(boolean lovesBones) {
        this.lovesBones = lovesBones;
    }

    public static void setNumDogs(int numDogs) {
        Dog.numDogs = numDogs;
    }

    /*
     * Methods
     */

    public void animalSound(){
        System.out.println(AnimalSound.DOG.getSound());
    }
}
