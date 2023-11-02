package M1C2;

import java.util.function.Predicate;

public class ProductImpl implements Filtrable {

    @Override
    public boolean accomplishFilter(Product product) {
        Predicate<Product> marketable = Filtrable.marketable;
        Predicate<Product> disposable = Filtrable.disposable;
        Predicate<Product> imperishable = Filtrable.imperishable;

        return marketable.test(product) && imperishable.test(product) && disposable.test(product);
    }
}
