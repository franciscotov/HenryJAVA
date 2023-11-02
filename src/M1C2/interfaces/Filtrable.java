package M1C2.interfaces;

import M1C2.classes.Product;

import java.util.function.Predicate;

@FunctionalInterface
public interface Filtrable {
    boolean accomplishFilter(Product product);
}
