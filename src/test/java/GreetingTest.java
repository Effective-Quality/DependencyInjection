import Helper.TestHelper;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sebastian on 14/09/16.
 */
public class GreetingTest {

    Greeting sut;
    TestHelper h;

    @Before
    public void setUp(){
        sut = new Greeting();
        h = new TestHelper();
    }

    @Test
    public void test_guten_morgen(){

        sut.currentTime = h.createTime(8,0,0);

        String r = sut.greet();
        String e = "Guten Morgen";

        Assert.assertEquals("'Guten Morgen' is expected", e, r);

    }

    @Test
    public void test_guten_vormittag(){

        sut.currentTime = h.createTime(11,0,0);

        String r = sut.greet();
        String e = "Guten Vormittag";

        Assert.assertEquals("'Guten Vormittag' is expected", e, r);

    }

    @Test
    public void test_guten_nachmittag(){

        sut.currentTime = h.createTime(15,0,0);

        String r = sut.greet();
        String e = "Guten Nachmittag";

        Assert.assertEquals("'Guten Nachmittag' is expected", e, r);

    }

    @Test
    public void test_guten_abend(){

        sut.currentTime = h.createTime(21,0,0);

        String r = sut.greet();
        String e = "Guten Abend";

        Assert.assertEquals("'Guten Abend' is expected", e, r);

    }

    @Test
    public void test_gute_nacht(){

        sut.currentTime = h.createTime(23,0,0);

        String r = sut.greet();
        String e = "Gute Nacht";

        Assert.assertEquals("'Gute Nacht' is expected", e, r);

    }

}
