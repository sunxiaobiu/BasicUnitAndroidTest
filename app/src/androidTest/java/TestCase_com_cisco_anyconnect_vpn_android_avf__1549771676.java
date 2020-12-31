import android.os.Process;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cisco_anyconnect_vpn_android_avf__1549771676 {
   public static void testCase() throws Exception {
      int var0 = Process.getGidForName("net_raw");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
