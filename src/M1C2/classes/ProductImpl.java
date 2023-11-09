package M1C2.classes;

import M1C2.interfaces.Filtrable;

import java.util.Random;

public class ProductImpl {

    private Product[] products;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Double generateRamdomDouble() {
        Random rand = new Random();
        return rand.nextDouble(1000);
    }

    public void generateProducts(int productsQuantity) {
        Product[] products = new Product[productsQuantity];
        for(int i = 0; i < productsQuantity; i++){
            Product newProduct = new Product();
            newProduct.setPrice(this.generateRamdomDouble());
            newProduct.setName("Product " + i);
            newProduct.setCode("Product-" + i);
            products[i] = newProduct;
        }
        this.setProducts(products);
    }

    public void filterProducts(Product[] products, Filtrable filter) {
        System.out.println("Productos que cumplen con el criterio del filtro " + filter.getClass().getSimpleName() + ": ");
        for (Product product: products){
            if(filter.accomplishFilter(product)){
                System.out.println(product);
            }
        }
    }

}
