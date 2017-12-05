import org.junit.Before;
import org.junit.Test;

public class Junttest {

    @Before
    public void beforeTest(){
        System.out.println("Running before test");

    }



    @Test
    public void junitTest(){
        System.out.println("Running Junit test");
    }
}
