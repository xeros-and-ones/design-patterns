package structural_patterns.adapter_pattern;

public class Main {
    public static void main(String[] args) {
        LegacySystem legacy = new LegacySystem();
        ModernSystem adapter = new PaymentAdapter(legacy);

        adapter.payment(100.0f);
    }
}
