import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import lotr.King;

public class KingTest {
    @Test
    public void testKingConstructor() {
        King king = new King();
        assertTrue(king.getPower() >= 5 && king.getPower() <= 15, "King's power should be between 5 and 15");
        assertTrue(king.getHp() >= 5 && king.getHp() <= 15, "King's hp should be between 5 and 15");
    }
}
