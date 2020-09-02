package gr.prod.purchase.api;

import gr.prod.purchase.model.Product;

import java.util.List;

public interface IStore {
    void buy (Product product);
    void sell (Product product);
    double getRevenue();
    List<Product> getInventory();
}
