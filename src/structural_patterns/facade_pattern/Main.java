package structural_patterns.facade_pattern;

public class Main {
    public static void main(String[] args) {
        HomeTheater hm = new HomeTheater(new Amplifier(), new DvdPlayer(), new Projector());
        hm.watchMovie("minecraft");
    }
}
