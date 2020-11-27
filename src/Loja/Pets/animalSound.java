package Loja.Pets;

public enum animalSound {
    DOG("AuuAu"), CAT("Mauu");

    private final String  sound;

    animalSound(String sound){
        this.sound = sound;
    }

    public String getSound(){ return sound;}
}
