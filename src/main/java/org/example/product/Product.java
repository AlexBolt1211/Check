package org.example.product;

public class Product {
    private int id;
    private String name;
    private double price;
    private boolean discount;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return " " +
                "id " + id +
                " " + name + '\'' +
                ", " + price +
                ", discount " + discount +
                '\n';
    }
}
