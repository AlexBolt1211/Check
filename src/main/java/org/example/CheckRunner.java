package org.example;

import org.example.cashreceipt.CashReceipt;
import org.example.shop.Shop;

public class CheckRunner {
    public static void main(String[] args) {

        Shop.addProduct(8, "молоко",4.9);
        Shop.addProduct(8, "картошка",3.6,true);
        Shop.addProduct(8, "сахар",2.4);

        CashReceipt cashReceipt = new CashReceipt();
        cashReceipt.CheckRunner(1,5);

        System.out.println(cashReceipt.getProductsList().toString());

    }
}