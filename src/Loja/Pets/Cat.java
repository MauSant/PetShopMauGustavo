package Loja.Pets;

public class Cat extends Animal {
    private boolean isFurBallSpitter;
    private static int numCats;
    /*
     * Contrutores
     */

    public Cat(String name,String sound) {
        super(name, sound);
        this.isFurBallSpitter = true;
    }

    public Cat(String name,String sound, boolean isFurrBallSpitter) {
        super(name, sound);
        this.isFurBallSpitter = true;
    }

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


    /*
     * Setters
     */
    public void setFurBallSpitter(boolean furBallSpitter) {
        isFurBallSpitter = furBallSpitter;
    }

    /*
     * Methods
     */
    public void animalCatSound(){
        System.out.println(AnimalSound.CAT.getSound());
    }
}
