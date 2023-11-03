package M1C2.interfaces;

import M1C2.classes.Product;

@FunctionalInterface
public interface Filtrable {
    boolean accomplishFilter(Product product);
}
