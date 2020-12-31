import android.text.format.Time;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dencreak_wcoupon__640711943 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Time.class);
      String var2 = ((Time)var1).format3339(false);
   }
}
