import android.net.ConnectivityManager;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alprincesa_ramadan__1740524014 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      boolean var1 = ConnectivityManager.isNetworkTypeValid(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
