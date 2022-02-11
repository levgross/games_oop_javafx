package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test (expected = FigureNotFoundException.class)
    public void whenFigureNotFoundExceptionThrownThenExpectationSatisfied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C2, Cell.H6);
    }

    @Test (expected = OccupiedCellException.class)
    public void whenOccupiedCellExceptionThrownThenExpectationSatisfied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.B2));
        logic.move(Cell.C1, Cell.A3);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenImpossibleMoveExceptionThrownThenExpectationSatisfied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.A1);
    }
}