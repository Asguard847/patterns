package State;

public class Grant {

    private GrantState grantState;

    public void checkState(){
        grantState.displayState();
    }

    public GrantState getGrantState() {
        return grantState;
    }

    public void setGrantState(GrantState grantState) {
        this.grantState = grantState;
    }
}
