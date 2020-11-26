package Loja;

public class Worker {
    private String name;
    private String job;
    private float salary;

    /*
     * Contrutores
     */

    public Worker(String name, String job, float salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    /*
     * Getters
     */

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public float getSalary() {
        return salary;
    }
    /*
     * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    /*
     * Methods
     */
}
