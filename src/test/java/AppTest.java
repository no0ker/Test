import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void a(){
        Res res = new Res();
        res.init(5);
        res.add((short) 4);
        res.add((short) 2);
        res.add((short) 4);
        res.add((short) 1);
        res.add((short) 2);

        assertEquals(2, res.getRes(0, 1));
        assertEquals(4, res.getRes(0, 2));
        assertEquals(2, res.getRes(1, 3));
        assertEquals(2, res.getRes(0, 1));
        assertEquals(2, res.getRes(4, 4));
    }

    @Test
    public void b(){
        Res res = new Res();
        res.init(7);
        res.add((short) 4);
        res.add((short) 5);
        res.add((short) 3);
        res.add((short) 3);
        res.add((short) 3);
        res.add((short) 5);
        res.add((short) 3);

        assertEquals(3, res.getRes(2, 6));
        assertEquals(3, res.getRes(0, 6));
        assertEquals(3, res.getRes(3, 3));
        assertEquals(3, res.getRes(3, 6));

    }
 @Test
    public void c(){
        Res res = new Res();
        res.init(4);
        res.add((short) 3);
        res.add((short) 4);
        res.add((short) 3);
        res.add((short) 5);

        assertEquals(4, res.getRes(1, 1));
        assertEquals(3, res.getRes(2, 2));
        assertEquals(3, res.getRes(0, 3));
        assertEquals(3, res.getRes(0, 2));
        assertEquals(3, res.getRes(1, 2));
        assertEquals(5, res.getRes(3, 3));

    }
}
