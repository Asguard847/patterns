package observer.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PostOffice {

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private Newspaper newspaper;
    private Magazine magazine;

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    public Newspaper getNewspaper() {
        return newspaper;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setNewspaper(Newspaper newspaper) {
        pcs.firePropertyChange("newspaper", this.newspaper, newspaper);
        this.newspaper = newspaper;
    }

    public void setMagazine(Magazine magazine) {
        pcs.firePropertyChange("magazine", this.magazine, magazine);
        this.magazine = magazine;
    }
}
