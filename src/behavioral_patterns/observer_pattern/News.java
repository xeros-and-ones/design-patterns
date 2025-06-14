package behavioral_patterns.observer_pattern;

import java.util.ArrayList;
import java.util.List;

class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel){
        channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }

    public void setNews(String news){
        this.news = news;
        notifyObservers();
    }

    private void notifyObservers(){
        for (Channel channel : channels) {
            channel.update(news);
        }
    }
}
interface Channel {
    void update(String news);
}

class NewsChannel implements Channel {
    @Override
    public void update(String news) {
        System.out.println("Breaking news: " + news);
    }
}