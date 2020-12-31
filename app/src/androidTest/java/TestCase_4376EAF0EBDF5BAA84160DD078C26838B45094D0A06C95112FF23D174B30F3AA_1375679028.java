import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.ConnectivityManager.NetworkCallback;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_4376EAF0EBDF5BAA84160DD078C26838B45094D0A06C95112FF23D174B30F3AA_1375679028 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(ConnectivityManager.class);
      Object var1 = EasyMock.createMock(NetworkRequest.class);
      Object var2 = EasyMock.createMock(NetworkCallback.class);
      Object var3 = EasyMock.createMock(Handler.class);
      ((ConnectivityManager)var4).registerNetworkCallback((NetworkRequest)var1, (NetworkCallback)var2, (Handler)var3);
   }
}
