import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest2
{
    @Test
    public void a(){
        Res2 res = new Res2();

        res.add("DEVELOPER.@gmail.com");
        res.add("t+es+ter@GMAIL.COM");
        res.add("T@bmail.com");
        res.add("a@gmail.com.ru");
        res.add("D.eveloper@Gmail.Com");
        res.add("a+b@gmail.com.ru\n");

        res.getRes();

    }
}
