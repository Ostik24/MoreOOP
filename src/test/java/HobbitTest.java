import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import lotr.Hobbit;

public class HobbitTest {
    @Test
    public void testHobbitConstructor() {
        Hobbit hobbit = new Hobbit();
        assertEquals(0, hobbit.getPower(), "Hobbit's power should be 0");
        assertEquals(3, hobbit.getHp(), "Hobbit's hp should be 3");
    }
}
