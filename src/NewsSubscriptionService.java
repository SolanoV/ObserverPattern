public class NewsSubscriptionService {
    public static void main(String[] args) {
        NewsAgency na = new NewsAgency();

        // Create Subscribers
        Subscriber klein = new Subscriber();
        klein.setName("Klein");

        Subscriber sherlock = new Subscriber();
        sherlock.setName("Sherlock");

        Subscriber gehrman = new Subscriber();
        gehrman.setName("Gehrman");

        na.subscribe(klein);
        na.subscribe(sherlock);
        na.subscribe(gehrman);

        na.publishNews("The Queen of England has passed at the age of 100!");

        na.unsubscribe(sherlock);

        Subscriber dwayne = new Subscriber();
        dwayne.setName("Dwayne");
        na.subscribe(dwayne);

        na.publishNews("The title of monarch has been passed down to the next in line of heirs, the Crown Prince, Alexander the 3rd!");
    }
}