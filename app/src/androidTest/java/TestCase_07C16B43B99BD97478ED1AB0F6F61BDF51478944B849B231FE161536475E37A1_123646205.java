import android.os.Handler;
import android.os.Looper;
import android.os.Handler.Callback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_07C16B43B99BD97478ED1AB0F6F61BDF51478944B849B231FE161536475E37A1_123646205 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Looper.class);
      Object var1 = EasyMock.createMock(Callback.class);
      Handler.createAsync((Looper)var0, (Callback)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
