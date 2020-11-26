package Loja;

public class Produto {
    private String name;
    private float price;
    private int stock;

    /*
    * Contrutores
     */

    public Produto(String name, float price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    /*
    * Getters
     */

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
    /*
    * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    /*
    * Methods
     */
}
