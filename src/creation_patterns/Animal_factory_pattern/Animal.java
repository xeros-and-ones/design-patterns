package creation_patterns.Animal_factory_pattern;

interface Animal {
    void speak();
}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("woof");
    }
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("meaw");
    }
}

class AnimaFactory {
    public Animal createAnimal(String type) {
        return switch (type.toLowerCase()) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> throw new IllegalArgumentException("unknown animal");
        };
    }
}
