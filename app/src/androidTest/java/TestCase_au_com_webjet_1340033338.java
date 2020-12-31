import android.text.format.Time;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_webjet_1340033338 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Time.class);
      Object var1 = EasyMock.createMock(Time.class);
      ((Time)var2).before((Time)var1);
   }
}
