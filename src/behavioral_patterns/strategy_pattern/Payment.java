package behavioral_patterns.strategy_pattern;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPay implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid: " + amount + " Using Credit Card");
    }
}

class PaypalPay implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid: " + amount + " Using Paypal");
    }
}

class CashPay implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid: " + amount + " Using Cash");
    }
}

class PaymentCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}