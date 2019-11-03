package observer.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener {

    private Magazine magazine;
    private Newspaper newspaper;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("newspaper")) {
            this.newspaper = (Newspaper) evt.getNewValue();
        }
        if (evt.getPropertyName().equals("magazine")) {
            this.magazine = (Magazine) evt.getNewValue();
        }
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public Newspaper getNewspaper() {
        return newspaper;
    }
}
