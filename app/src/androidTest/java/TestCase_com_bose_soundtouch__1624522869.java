import android.net.ConnectivityManager;
import android.net.Network;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bose_soundtouch__1624522869 {
   public static void testCase() throws Exception {
      Network var0 = ConnectivityManager.getProcessDefaultNetwork();
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
