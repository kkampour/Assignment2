package gr.prod.purchase.impl;

import gr.prod.purchase.api.IStore;
import gr.prod.purchase.model.Product;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetails implements IStore {

    private double totalBuyBalance;
    private double totalSellBalance;

    public InventoryRetails() {

    }

    List<Product> productList;
    public List<Product> getInventory(){
        return productList;
    }

    public  void reset(){
        productList= new ArrayList<>();
    }
    @Override
    public void buy(Product product) {
    productList.add(product);
    totalBuyBalance= totalBuyBalance+ product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        productList.remove(product);
       totalSellBalance=totalBuyBalance+ product.getPriceWhenSell();

    }

    @Override
    public double getRevenue() {
        return 0;
    }

    //public List<Product> getInventory(){
        //return null;
    //}
}
