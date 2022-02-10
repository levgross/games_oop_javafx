package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenPositionIsEqual() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C3);
        assertThat(bishopBlack.position(), is(Cell.C3));
    }

    @Test
    public void whenCopyWorks() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.copy(Cell.C3).position(), is(Cell.C3));
    }

    @Test
    public void whenWayWorks() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5), is(rsl));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenExceptionThrownThenExpectationSatisfied() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G6);
    }
}