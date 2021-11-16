import org.junit.jupiter.api.Test;
import operation.Somme;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestSomme
{
    @Test
    void test()
    {
        Somme s = new Somme();
        int res = s.somme(10, 5);
        assertEquals(15, res);
    } }