package org.example.cashreceipt;

import org.example.product.Product;
import org.example.shop.Shop;

import java.util.ArrayList;
import java.util.List;

public class CashReceipt {
    private List<Product> productsList = new ArrayList<>();

    public void CheckRunner(int id, int count){
        for (int i = 0; i <= count; i++){
            Shop.getProductList().get(id);
            productsList.add(Shop.getProductList().get(id));
       }
    }

    public List<Product> getProductsList() {
        return productsList;
    }
}
