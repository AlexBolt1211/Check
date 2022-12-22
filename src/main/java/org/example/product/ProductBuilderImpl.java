package org.example.product;

public class ProductBuilderImpl implements ProductBuilder {
    Product product = new Product();
    @Override
    public ProductBuilder setId(int id) {
        product.setId(id);
        return this;
    }

    @Override
    public ProductBuilder setName(String name) {
        product.setName(name);
        return this;
    }

    @Override
    public ProductBuilder setPrice(double price) {
        product.setPrice(price);
        return this;
    }

    @Override
    public ProductBuilder setDiscount(boolean discount) {
        product.setDiscount(discount);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
