package State;

public class Main {

    public static void main(String[] args) {
        Grant grant = new Grant();
        grant.setGrantState(new ApprovedState());
        grant.checkState();
    }
}
