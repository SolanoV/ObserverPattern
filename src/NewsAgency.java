import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Publisher {
    private List<Subscriber> subscribers;
    private String latestNews;

    public NewsAgency() {
        subscribers = new ArrayList<Subscriber>();
    }
    @Override
    public void subscribe(Subscriber s) {
        subscribers.add(s);
        System.out.println(">>> LOG: New subscriber added.\n");
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
        System.out.println(">>> LOG: Subscriber removed.\n");
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(latestNews);
        }
    }

    public void publishNews(String newsHeadline) {
        latestNews = newsHeadline;
        notifySubscribers();
    }
}
