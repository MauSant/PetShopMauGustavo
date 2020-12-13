package Loja.Pets;

public class Cat extends Animal {
    private String animalSound;
    private boolean isFurBallSpitter;
    private static int numCats;
    /*
     * Contrutores
     */

    public Cat(String name, String animalSound, boolean isFurrBallSpitter) {
        super(name, animalSound);
        this.isFurBallSpitter = isFurrBallSpitter;
        this.animalSound = AnimalSound.CAT.getSound();
    }

    public Cat(String name, String animalSound) {
        super(name, animalSound);
        this.animalSound = AnimalSound.CAT.getSound();
    }
    /*
     * Getters
     */

    public boolean isFurBallSpitter() {
        return isFurBallSpitter;
    }

    public static int getNumCats() {
        return numCats;
    }

    public String getAnimalSound() {
        return animalSound;
    }
    /*
     * Setters
     */
    public void setFurBallSpitter(boolean furBallSpitter) {
        isFurBallSpitter = furBallSpitter;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    public static void setNumCats(int numCats) {
        Cat.numCats = numCats;
    }

    /*
     * Methods
     */

    public void animalSound(){
        System.out.println(AnimalSound.CAT.getSound());
    }
}
