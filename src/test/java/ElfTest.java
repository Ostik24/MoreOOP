import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lotr.Elf;

public class ElfTest {
    @Test
    public void testElfConstructor() {
        Elf elf = new Elf();
        assertEquals(10, elf.getPower(), "Elf's power should be 10");
        assertEquals(10, elf.getHp(), "Elf's hp should be 10");
    }
}
