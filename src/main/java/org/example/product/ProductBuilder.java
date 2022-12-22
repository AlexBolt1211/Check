package org.example.product;

public interface ProductBuilder {
    ProductBuilder setId(int id);
    ProductBuilder setName(String name);
    ProductBuilder setPrice(double price);
    ProductBuilder setDiscount(boolean discount);
    Product build();
}
