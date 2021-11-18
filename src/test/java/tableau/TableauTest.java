package tableau;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TableauTest {
    @Test
    void triSelectTab()
    {
        String[] t1 = new String[] {"4","3"};
        int[] t2 = new int[] {3,4};
        TriTableau tab1 = new TriTableau(t1);
        tab1.triSelection();
        int[] res = tab1.getArray();
        assertArrayEquals(t2, res);
    }

    @Test
    void triSelectTabPassageFor(){
        String[] t1 = new String[] {"4"};
        int[] t2 = new int[] {4};
        TriTableau tab1 = new TriTableau(t1);
        tab1.triSelection();
        int[] res = tab1.getArray();
        assertArrayEquals(t2, res);
    }

    @Test
    void triSelectTabPassageIf(){
        String[] t1 = new String[] {"3","4"};
        int[] t2 = new int[] {3,4};
        TriTableau tab1 = new TriTableau(t1);
        tab1.triSelection();
        int[] res = tab1.getArray();
        assertArrayEquals(t2, res);
    }

    @Test
    void triInsertion(){
        String[] t1 = new String[] {"3","4"};
        int[] t2 = new int[] {3,4};
        TriTableau tab1 = new TriTableau(t1);
        tab1.triInsertion();
        int[] res = tab1.getArray();
        assertArrayEquals(t2, res);
    }

    @Test
    void triInsertionTabPassageWhile(){
        String[] t1 = new String[] {};
        int[] t2 = new int[] {};
        TriTableau tab1 = new TriTableau(t1);
        tab1.triInsertion();
        int[] res = tab1.getArray();
        assertArrayEquals(t2, res);
    }
}
