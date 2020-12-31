import android.os.Looper;
import android.os.MessageQueue;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_badoo_mobile__1347263939 {
   @Test
   public void testCase() throws Exception {
      Looper var1 = Looper.getMainLooper();
      MessageQueue var2 = var1.getQueue();
      boolean var3 = var2.isIdle();
   }
}
