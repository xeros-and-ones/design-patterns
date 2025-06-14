package structural_patterns.adapter_pattern;

class LegacySystem {
    void pay(int dollars) {
        System.out.println("Paid: " + dollars);
    }
}

interface ModernSystem {
    void payment(float euros);
}

class PaymentAdapter implements ModernSystem {
    private LegacySystem legacy;

    public PaymentAdapter(LegacySystem legacy) {
        this.legacy = legacy;
    }

    @Override
    public void payment(float euros) {
        int dollars = (int) (euros * 1.18);
        legacy.pay(dollars);
    }
}