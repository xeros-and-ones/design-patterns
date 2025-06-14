package creation_patterns.pizza_builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String dough;
    private String souce;
    private List<String> toppings;

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.souce = builder.sauce;
        this.toppings = builder.toppings;
    }

    public static class Builder {
        private String dough;
        private String sauce;
        private List<String> toppings = new ArrayList<>();

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }
        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public Builder topping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
