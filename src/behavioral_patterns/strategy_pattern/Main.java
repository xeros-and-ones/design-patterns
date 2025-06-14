package behavioral_patterns.strategy_pattern;

public class Main {
    public static void main(String[] args) {
        PaymentCart cart = new PaymentCart();
        cart.setPaymentStrategy(new CashPay());
        cart.checkout(100);
    }
}
