package creation_patterns.Animal_factory_pattern;

public class Main {
    public static void main(String[] args) {
        AnimaFactory factory = new AnimaFactory();

        Animal cat = factory.createAnimal("cat");
        cat.speak();

    }
}
