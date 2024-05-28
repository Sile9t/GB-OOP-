package ru.gb.vending_machine.vending;

import ru.gb.vending_machine.products.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    @SuppressWarnings("unused")
    private int id;
    private int productId;
    private List<Product> productList;

    public VendingMachine(int id) {
        this.id = id;
        productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        product.setId(productId++);
        productList.add(product);
    }

    public String getProductsInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:\n");
        for (Product product: productList){
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
