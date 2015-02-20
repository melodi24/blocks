package pt314.blocks.game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for <code>GameBoard.moveBlock</code>.
 */
public class moveBlockTest {
	@Test
	public void testMoveBlockMethod() {
		GameBoard board = new GameBoard(5, 5);
		board.placeBlockAt(new HorizontalBlock, 1, 1);
		board.placeBlockAt(new VerticalBlocck, 3, 3);
		
		board.moveBlock(1, 1, direction.RIGHT, 2);
		assertTrue(board.getBlockAt(3, 1) instanceof HorizontalBlock);
		
		board.moveBlock(1, 1, direction.DOWN, 1);
		assertTrue(board.getBlockAt(1, 2) instanceof VerticalBlock);
	}
}
