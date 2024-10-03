import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import lotr.Knight;

public class KnightTest {
    @Test
    public void testKnightConstructor() {
        Knight knight = new Knight();
        assertTrue(knight.getPower() >= 2 && knight.getPower() <= 12, "Knight's power should be between 2 and 12");
        assertTrue(knight.getHp() >= 2 && knight.getHp() <= 12, "Knight's hp should be between 2 and 12");
    }
}
