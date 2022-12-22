package org.example.shop;

import org.example.product.Product;
import org.example.product.ProductBuilderImpl;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static List<Product> productList = new ArrayList<>();

    public static void addProduct(int id, String name, double price, boolean discount){
        productList.add(new ProductBuilderImpl().setId(id).setName(name).setPrice(price).
                setDiscount(discount).build());
    }

    public static void  addProduct(int id, String name, double price){
        productList.add(new ProductBuilderImpl().setId(id).setName(name).setPrice(price).build());
    }

    public static List<Product> getProductList() {
        return productList;
    }

}
