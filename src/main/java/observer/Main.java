package observer;

import observer.model.Magazine;
import observer.model.Newspaper;
import observer.model.PostOffice;
import observer.model.Subscriber;

public class Main {

    public static void main(String[] args) {

        PostOffice postOffice = new PostOffice();
        Subscriber subscriber = new Subscriber();

        postOffice.addPropertyChangeListener(subscriber);

        postOffice.setMagazine(new Magazine("Playboy"));
        postOffice.setNewspaper(new Newspaper("Pravda"));

        System.out.println("Subscriber got magazine: " + subscriber.getMagazine());
        System.out.println("Subscriber got newspaper: " + subscriber.getNewspaper());
    }
}
