package structural_patterns.facade_pattern;

class Amplifier {
    void on() {
        System.out.println("Amplifier On");
    }
    void setVolume(int vol) {
        System.out.println("Volume Set To: " + vol);
    }
}
class DvdPlayer {
    void on() {
        System.out.println("Dvd Player is on");
    }
    void play(String movie) {
        System.out.println("DVD playing: " + movie);
    }
}
class Projector {
    void on() {
        System.out.println("Projector is on");
    }
    void setInput(DvdPlayer dvd) {
        System.out.println("Input set to DVD");
    }
}

class HomeTheater {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;

    public HomeTheater(Amplifier amp, DvdPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        amp.on();
        amp.setVolume(40);
        dvd.on();
        projector.on();
        projector.setInput(dvd);
        dvd.play(movie);
    }
}
