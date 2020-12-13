package Loja.Pets;

public class Cat extends Animal {
    private boolean isFurBallSpitter;
    private static int numCats;
    /*
     * Contrutores
     */

    public Cat(String name, boolean isFurrBallSpitter) {
        super(name, AnimalSound.CAT.getSound());
        this.isFurBallSpitter = isFurrBallSpitter;
    }

    public Cat(String name) {
        super(name, AnimalSound.CAT.getSound());
    }
    /*
     * Getters
     */

    public boolean isFurBallSpitter() {
        return isFurBallSpitter;
    }

    public String getAnimalSound() {
        return AnimalSound.CAT.getSound();
    }
    /*
     * Setters
     */
    public void setFurBallSpitter(boolean furBallSpitter) {
        isFurBallSpitter = furBallSpitter;
    }

    /*
     * Methods
     */

    public void animalSound(){
        System.out.println(AnimalSound.CAT.getSound());
    }
}
