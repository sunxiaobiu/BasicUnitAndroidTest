import android.text.format.Time;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bsc101_brain_1118614264 {
   @Test
   public void testCase() throws Exception {
      Time var2 = new Time();
      Object var1 = EasyMock.createMock(Time.class);
      var2.after((Time)var1);
   }
}
