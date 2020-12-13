package Loja;

import Loja.Pets.Animal;
import Loja.Pets.AnimalSound;
import Loja.Pets.Cat;
import Loja.Pets.Dog;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Polimorfismo
        Dog leonardo = new Dog("leonardo", AnimalSound.DOG.getSound(),true);
        Cat mauricio = new Cat("mauricio", AnimalSound.CAT.getSound(),true);



    }
}
