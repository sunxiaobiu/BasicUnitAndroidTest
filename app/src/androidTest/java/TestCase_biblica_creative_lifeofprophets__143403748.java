import android.os.Handler;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_biblica_creative_lifeofprophets__143403748 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Handler.class);
      String var1 = "android";
      Message.obtain((Handler)var0, 1004, 0, 0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
