import android.net.ConnectivityManager;
import android.support.v4.net.ConnectivityManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_leyes__1239902158 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ConnectivityManager.class);
      boolean var1 = ConnectivityManagerCompat.isActiveNetworkMetered((ConnectivityManager)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
