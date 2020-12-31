import android.net.TrafficStats;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock__1121554948 {
   public static void testCase() throws Exception {
      byte var2 = 1;
      long var0 = TrafficStats.getUidTcpRxBytes(var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
