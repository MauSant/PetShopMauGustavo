package Loja.Pets;

public class Dog extends Animal {
    private String animalSound;
    private boolean lovesBones;
    /*
     * Contrutores
     */

    public Dog(String name) {
        super(name,AnimalSound.DOG.getSound());
    }

    public Dog(String name, boolean lovesBones) {
        super(name,AnimalSound.DOG.getSound());
        this.lovesBones = lovesBones;
    }
    /*
     * Getters
     */

    @Override
    public String getAnimalSound() {
        return  AnimalSound.DOG.getSound();
    }

    public boolean isLovesBones() {
        return lovesBones;
    }

    /*
     * Setters
     */

    public void setLovesBones(boolean lovesBones) {
        this.lovesBones = lovesBones;
    }


    /*
     * Methods
     */

    public void animalSound(){
        System.out.println(AnimalSound.DOG.getSound());
    }
}
