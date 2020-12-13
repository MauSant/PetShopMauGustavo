package Loja;

import Loja.People.Client;
import Loja.People.Manager;
import Loja.People.People;
import Loja.People.Worker;
import Loja.Pets.Animal;
import Loja.Pets.AnimalSound;
import Loja.Pets.Cat;
import Loja.Pets.Dog;

import java.util.Scanner;

public class MenuApresentacao {

    private Loja loja;
    private static boolean naLoja;

    void startMenu(){
        setNaLoja(true);

        System.out.println("Seja bem vindo ao Petshop!");
        while (isNaLoja()){
            System.out.println("Selecione a opção desejada:");
            System.out.println("0 - Exemplo de Sobrecarga");
            System.out.println("1 - Exemplo de Casting");
            System.out.println("2 - Exemplo de Composição");
            System.out.println("3 - Exemplo de InstanceOf");
            System.out.println("4 - Exemplo de Interface");
            System.out.println("7 - Exemplo de Polimorfismo");
            System.out.println("10 - Sair");
            try {
                Scanner scan = new Scanner(System.in);
                int option = scan.nextInt();

                switch (option) {
                    case (0) -> sobrecarga();
                    case (1) -> casting();
                    case (2) -> composicao();
                    case (3) -> instanceOf();
                    case (4) -> interfaceExample();

                    default -> setNaLoja(false);
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                setNaLoja(false);
            }

        }
    }

    private void sobrecarga(){
        System.out.println("Sobrecarga");
        Client soNome = new Client("Gustavo");
        System.out.println(soNome.toString());
        Client comDinheiro = new Client("Mauricio",10);
        System.out.println(comDinheiro.toString());
    }

    private void casting(){
        System.out.println("Casting");
        Animal dog = new Animal("Dogão","auuu");
        Worker.whatSoundItDoes(dog,"like a cat");
    }

    private void composicao(){
        Worker worker = new Worker("Mauricio",100,0);
        Loja CompFraca = new Loja("Loja com Composição Fraca",worker);
        System.out.println(CompFraca.toString());
        Loja CompForte = new Loja("Loja com Composição Forte","Mauricio",10);
        System.out.println(CompForte.toString());
    }

    private void instanceOf(){
        Client client = new Client("Gustavo");
        Worker worker = new Worker("Mauricio",100,0);
        Manager manager = new Manager("Mauricio",1000,0);
        People.makeCard(client);
        People.makeCard(worker);
        People.makeCard(manager);
    }

    private void interfaceExample(){
        Worker worker = new Worker("Mauricio",100,0);
        Manager manager = new Manager("Gustavo",100,101);
        worker.pedirAumento();
        manager.pedirAumento();

    }


    public static boolean isNaLoja() {
        return naLoja;
    }

    public static void setNaLoja(boolean naLoja) {
        MenuApresentacao.naLoja = naLoja;
    }
}
