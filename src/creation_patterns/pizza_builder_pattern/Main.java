package creation_patterns.pizza_builder_pattern;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .dough("thin")
                .sauce("tomato")
                .topping("cheese")
                .topping("meat")
                .build();

    }
}
