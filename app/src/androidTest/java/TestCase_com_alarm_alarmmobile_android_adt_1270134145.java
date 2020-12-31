import android.net.ConnectivityManager;
import android.net.Network;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alarm_alarmmobile_android_adt_1270134145 {
   public static void testCase() throws Exception {
      ConnectivityManager.setProcessDefaultNetwork((Network)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
