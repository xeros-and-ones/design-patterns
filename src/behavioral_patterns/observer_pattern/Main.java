package behavioral_patterns.observer_pattern;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.setNews("what ever just happened somewhere!!");
    }
}
