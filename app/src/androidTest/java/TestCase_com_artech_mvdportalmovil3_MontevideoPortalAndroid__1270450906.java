import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v4.net.ConnectivityManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_artech_mvdportalmovil3_MontevideoPortalAndroid__1270450906 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ConnectivityManager.class);
      Object var1 = EasyMock.createMock(Intent.class);
      ConnectivityManagerCompat.getNetworkInfoFromBroadcast((ConnectivityManager)var0, (Intent)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
