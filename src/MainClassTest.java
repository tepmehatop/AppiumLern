import jdk.nashorn.internal.ir.IfNode;
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


    @Test
    public void testGetClassString()
    {
        MainClass mainClass = new MainClass();
        String z = mainClass.getClassString();

        if(z.contains("Hello") | z.contains("hello"))
        {
            System.out.println("getClassNumber возвращает строку, в которой есть подстрока “hello” или “Hello”");
        }
        else
        {
            Assert.assertFalse("getClassNumber возвращает строку, в которой нет подстрок “hello” или “Hello”",true);
        }
    }

}
