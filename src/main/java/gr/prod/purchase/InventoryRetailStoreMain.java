package gr.prod.purchase;

import gr.prod.purchase.api.IStore;
import gr.prod.purchase.impl.InventoryRetails;
import gr.prod.purchase.model.Product;

public class InventoryRetailStoreMain {

    public static void main(String[] args) {
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);
        IStore invStore = new InventoryRetails();
        invStore.buy(x1);
        invStore.buy(x4);
        invStore.sell(x1);
        System.out.println(invStore.getRevenue());
        invStore.sell(x2); invStore.getInventory();

    }


}
