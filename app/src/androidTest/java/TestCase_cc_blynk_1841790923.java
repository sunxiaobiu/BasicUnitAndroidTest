import android.net.TrafficStats;
import androidx.test.runner.AndroidJUnit4;
import java.net.Socket;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cc_blynk_1841790923 {
   public static void testCase() throws Exception {
      Object var0 = null;
      TrafficStats.tagSocket((Socket)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
