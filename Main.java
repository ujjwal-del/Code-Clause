import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        ShoppingCart cart = new ShoppingCart();
        Checkout checkout = new Checkout();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Browse products");
            System.out.println("2. View cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Products:");
                    for (Product product : catalog.getProducts()) {
                        System.out.println(product.getName() + " - " + product.getPrice());
                    }
                    System.out.println("Enter product ID to add to cart:");
                    int productId = scanner.nextInt();
                    Product product = catalog.getProducts().get(productId - 1);
                    cart.addProduct(product);
                    break;
                case 2:
                    cart.viewCart();
                    break;
                case 3:
                    checkout.processPayment(cart);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}