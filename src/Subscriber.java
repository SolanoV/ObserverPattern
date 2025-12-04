public class Subscriber implements SubscriberObserver {
    private String subscriberName;

    public String getName() {
        return subscriberName;
    }

    public void setName(String name) {
        this.subscriberName = name;
    }

    @Override
    public void update(String newsHeadline) {
        System.out.println(">>> Notification for " + subscriberName);
        System.out.println(">>> BREAKING NEWS: " + newsHeadline+"\n");
    }
}
