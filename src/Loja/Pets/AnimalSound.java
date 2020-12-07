package Loja.Pets;

public enum AnimalSound {
    DOG("AuuAu"), CAT("Mauu");

    private final String  sound;

    AnimalSound(String sound){
        this.sound = sound;
    }

    public String getSound(){ return sound;}
}
