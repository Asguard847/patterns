package Memento;

public class Cell {

    private CellState cellState;
    private CellAdress cellAdress;

    public Cell(CellState cellState, CellAdress cellAdress) {
        this.cellState = cellState;
        this.cellAdress = cellAdress;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public CellAdress getCellAdress() {
        return cellAdress;
    }

    public void setCellAdress(CellAdress cellAdress) {
        this.cellAdress = cellAdress;
    }
}
