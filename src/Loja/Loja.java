package Loja;

import java.util.ArrayList;

public class Loja {
    private String name;
    private ArrayList<Worker> workers;

    /*
     * Contrutores
     */

    public Loja(String name) {
        this.name = name;
        this.workers= new ArrayList<>();
    }
    /*
     * Getters
     */

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
    /*
     * Methods
     */

}
