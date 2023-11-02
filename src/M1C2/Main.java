package M1C2;

import M1C2.classes.Product;
import M1C2.classes.ProductImpl;
import M1C2.filters.Disposable;
import M1C2.filters.Imperishable;
import M1C2.filters.Marketable;
import M1C2.interfaces.Filtrable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProductImpl productImpl = new ProductImpl();
        productImpl.generateProducts(10);

        Product[] products = productImpl.getProducts();

        Arrays.sort(products);

        // Products by Marketable criteria
        Filtrable marketable = new Marketable();
        productImpl.filterProducts(products, marketable);

        // Products by Disposable criteria
        Filtrable disposable = new Disposable();
        productImpl.filterProducts(products, disposable);

        // Products by Imperishable criteria
        Filtrable imperishable = new Imperishable();
        productImpl.filterProducts(products, imperishable);
    }
}
