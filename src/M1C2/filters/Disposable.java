package M1C2.filters;

import M1C2.classes.Product;
import M1C2.interfaces.Filtrable;

public class Disposable implements Filtrable {
    @Override
    public boolean accomplishFilter(Product product) {
        return product.getName().toUpperCase().contains("DISPOSABLE");
    }
}
