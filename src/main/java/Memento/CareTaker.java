package Memento;

public class CareTaker {

    private Object object;

    public void save(TicTacToe ticTacToe){
        object = ticTacToe.saveGame();
    }

    public void undoTurn(TicTacToe ticTacToe){
        ticTacToe.undoTurn(object);
    }
}
