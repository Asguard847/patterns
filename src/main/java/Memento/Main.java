package Memento;

public class Main {

    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();
        CareTaker careTaker = new CareTaker();

        game.doTurn(CellAdress.B2, CellState.CROSS);
        System.out.println(game);

        careTaker.save(game);

        game.doTurn(CellAdress.A1, CellState.ZERO);
        System.out.println(game);

        careTaker.undoTurn(game);
        System.out.println(game);
    }
}
