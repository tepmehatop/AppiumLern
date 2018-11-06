import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber()
    {
        MainClass mainClass= new MainClass();
        int b = mainClass.getLocalNumber();
        Assert.assertEquals("getLocalNumber возвращает число не равное 14",14,b);
    }


    @Test
    public void testGetClassNumber()
    {
        MainClass mainClass = new MainClass();
        int a = mainClass.getClassNumber();
        int c = 45;

        Assert.assertTrue("getClassNumber возвращает число меньше 45", a > c);

    }



}
