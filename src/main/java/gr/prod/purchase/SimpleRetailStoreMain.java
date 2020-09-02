package gr.prod.purchase;

import gr.prod.purchase.api.IStore;
import gr.prod.purchase.impl.SimpleRetailStore;
import gr.prod.purchase.model.Product;

public class SimpleRetailStoreMain {
    public static void main(String[] args) {
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);
        IStore simple= new SimpleRetailStore();
        simple.buy(x1); simple.buy(x4); simple.sell(x1);
        System.out.println(simple.getRevenue());
    }
}
