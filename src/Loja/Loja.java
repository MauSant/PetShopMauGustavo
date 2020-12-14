package Loja;

import Loja.People.Client;
import Loja.People.Worker;
import Loja.Pets.Animal;

import java.util.ArrayList;
import java.util.Arrays;

public class Loja {
    private String name;
    private ArrayList<Worker> workers;
    private ArrayList<Animal> animals;
    private ArrayList<Produto> produtos;
    private ArrayList<Client> clients;
    /*
     * Contrutores
     */

    public Loja(String name) {
        this.name = name;
        this.workers= new ArrayList<Worker>();
        this.animals = new ArrayList<Animal>();
        this.produtos = new ArrayList<Produto>();
        this.clients = new ArrayList<Client>();
    }
    //***************************Exemplo COMPOSIÇÂO*********************************

    //Composition Loja with Worker, WEAK composition
    public Loja(String name, Worker worker){
        this.name = name;
        this.workers = new ArrayList<>();
        this.animals = new ArrayList<Animal>();
        this.produtos = new ArrayList<Produto>();
        this.clients = new ArrayList<Client>();
        this.workers.add(worker);
    }

    //Composition Loja with Worker, STRONG composition
    public Loja(String name, String workerName, float salary){
        this.name = name;
        this.workers = new ArrayList<>();
        this.animals = new ArrayList<Animal>();
        this.produtos = new ArrayList<Produto>();
        this.clients = new ArrayList<Client>();
        this.workers.add(new Worker(workerName,salary,0));
    }
    //***************************Exemplo COMPOSIÇÂO*********************************

    /*
     * Getters
     */

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public String getName() {
        return name;
    }
    /*
     * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void addWorkers(Worker worker) {
        this.workers.add(worker);
    }

    public void addAnimals(Animal animal) {
        this.animals.add(animal);
    }

    public void addProdutos(Produto produto) {this.produtos.add(produto);}

    public void addClients(Client clients) {
        this.clients.add(clients);
    }
    /*
     * Methods
     */

    @Override
    public String toString() {
        return "Loja{" +
                "name='" + name + '\'' +
                ", workers=" + this.getWorkers().get(0).getName() +
                ", animals=" + animals +
                ", produtos=" + produtos +
                ", clients=" + clients +
                '}';
    }
}
