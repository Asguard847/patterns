package State;

public class ApprovedState implements GrantState {

    @Override
    public void displayState() {
        System.out.println("Grant has been approved");
    }
}
