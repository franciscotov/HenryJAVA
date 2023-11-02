package M1C2;

public class Product implements  Comparable<Product>{

    private String name;
    private String code;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Product product) {
        return Double.compare(this.price, product.price);
    }
}
