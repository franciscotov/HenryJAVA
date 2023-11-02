package M1C2;

import java.util.function.Predicate;

@FunctionalInterface
public interface Filtrable {
    boolean accomplishFilter(Product product);

    Predicate<Product> marketable = product -> product.getPrice() > 0;
    Predicate<Product> disposable = product -> product.getPrice() < 100;
    Predicate<Product> imperishable = product -> product.getPrice() > 100;

}
