import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Klausiaczek on 2016-11-01.
 */
public class MainTest {
    @Test
    public void dodawanieTest(){
       Main m=new Main();
      assertEquals(4,m.dodawanie(2,2));
    }
}
