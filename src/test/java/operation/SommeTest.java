package operation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SommeTest
{
    @Test
    void test()
    {
        Somme s = new Somme();
        int res = s.somme(10, 5);
        assertEquals(res, 15);
    }
}