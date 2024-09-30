import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
        // add products to the catalog
        products.add(new Product(1, "Product 1", 10.99, 10));
        products.add(new Product(2, "Product 2", 9.99, 20));
        products.add(new Product(3, "Product 3", 12.99, 5));
    }

    public List<Product> getProducts() {
        return products;
    }
}