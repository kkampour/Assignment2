package gr.prod.purchase.impl;

import gr.prod.purchase.api.IStore;
import gr.prod.purchase.model.Product;

import java.util.List;

public class SimpleRetailStore implements IStore {

    private double totalBuyBalance;
    private double totalSellBalance;



    @Override
    public void buy(Product product) {
        totalBuyBalance= totalBuyBalance+product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        totalSellBalance=totalSellBalance+product.getPriceWhenSell();

    }

    @Override
    public double getRevenue() {
        return totalSellBalance-totalBuyBalance;
    }

    @Override
    public List<Product> getInventory() {
        return null;
    }
}
