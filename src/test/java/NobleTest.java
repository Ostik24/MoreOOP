import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import lotr.King;
import lotr.Knight;

public class NobleTest {
    @Test
    public void testNobleConstructorForKing() {
        King king = new King();
        assertTrue(king.getPower() >= 5 && king.getPower() <= 15, "King's power (as a Noble) should be between 5 and 15");
        assertTrue(king.getHp() >= 5 && king.getHp() <= 15, "King's hp (as a Noble) should be between 5 and 15");
    }

    @Test
    public void testNobleConstructorForKnight() {
        Knight knight = new Knight();
        assertTrue(knight.getPower() >= 2 && knight.getPower() <= 12, "Knight's power (as a Noble) should be between 2 and 12");
        assertTrue(knight.getHp() >= 2 && knight.getHp() <= 12, "Knight's hp (as a Noble) should be between 2 and 12");
    }
}
