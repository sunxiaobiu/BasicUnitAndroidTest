import android.os.Handler;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59598B3CC854A920D83344205D73C83CEDFE1C39990816A1291E7D79D11BF259__2072340346 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Handler.class);
      Object var1 = null;
      Message.obtain((Handler)var0, (Runnable)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
