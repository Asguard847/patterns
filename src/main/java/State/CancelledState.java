package State;

public class CancelledState implements GrantState{

    @Override
    public void displayState() {
        System.out.println("Grant has benn cancelled");
    }
}
