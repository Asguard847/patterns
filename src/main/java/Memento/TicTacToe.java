package Memento;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    private List<Cell> cells;

    public TicTacToe() {

        cells = new ArrayList<>();

        cells.add(new Cell(CellState.EMPTY, CellAdress.A1));
        cells.add(new Cell(CellState.EMPTY, CellAdress.A2));
        cells.add(new Cell(CellState.EMPTY, CellAdress.A3));
        cells.add(new Cell(CellState.EMPTY, CellAdress.B1));
        cells.add(new Cell(CellState.EMPTY, CellAdress.B2));
        cells.add(new Cell(CellState.EMPTY, CellAdress.B3));
        cells.add(new Cell(CellState.EMPTY, CellAdress.C1));
        cells.add(new Cell(CellState.EMPTY, CellAdress.C2));
        cells.add(new Cell(CellState.EMPTY, CellAdress.C3));
    }

    public void doTurn(CellAdress cellAdress, CellState cellState) {

        if(cellState.equals(CellState.EMPTY)){
            throw new IllegalArgumentException("Required state of a cell should not be empty!");
        }

        Cell result = cells
                .stream()
                .filter(e -> e.getCellAdress().equals(cellAdress))
                .findFirst().get();
        result.setCellState(cellState);
    }

    public Memento saveGame(){
        return new Memento(this.cells);
    }

    public void undoTurn(Object object){
        Memento memento = (Memento) object;
        this.cells = memento.cells;
    }

    private class Memento{
        private List<Cell> cells;

        public Memento(List<Cell> cells) {
            this.cells = new ArrayList<>();
            for(Cell cell: cells){
                Cell newCell = new Cell(cell.getCellState(), cell.getCellAdress());
                this.cells.add(newCell);
            }
        }
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder("\nCurrent game state: ");
       for(Cell cell: cells){
           sb.append("\n");
           sb.append(cell.getCellAdress());
           sb.append(" - ");
           sb.append(cell.getCellState());
       }
       return sb.toString();
    }
}
