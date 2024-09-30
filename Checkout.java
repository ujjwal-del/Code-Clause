public class Checkout {
    public void processPayment(ShoppingCart cart) {
        double total = cart.calculateTotal();
        System.out.println("Total: " + total);
        // simulate payment processing
        System.out.println("Payment processed successfully!");
    }
}