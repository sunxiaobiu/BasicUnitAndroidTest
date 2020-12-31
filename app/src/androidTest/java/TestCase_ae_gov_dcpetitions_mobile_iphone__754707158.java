import android.os.Handler;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__754707158 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Handler.class);
      Object var1 = null;
      Message.obtain((Handler)var0, 1, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
