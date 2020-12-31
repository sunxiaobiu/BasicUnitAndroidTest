import android.net.TrafficStats;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_tsn_mobile_android_726205634 {
   public static void testCase() throws Exception {
      long var0 = TrafficStats.getMobileRxBytes();
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
