import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.ConnectivityManager.NetworkCallback;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_spotto_driverapp__1503283599 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("connectivity");
      ConnectivityManager var5 = (ConnectivityManager)var4;
      Object var1 = EasyMock.createMock(NetworkRequest.class);
      Object var2 = EasyMock.createMock(NetworkCallback.class);
      var5.registerNetworkCallback((NetworkRequest)var1, (NetworkCallback)var2);
   }
}
