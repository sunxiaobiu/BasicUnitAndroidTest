import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6_1345674902 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ConnectivityManager.class);
      Network var1 = ((ConnectivityManager)var2).getActiveNetwork();
      NetworkCapabilities var3 = ((ConnectivityManager)var2).getNetworkCapabilities(var1);
      byte var4 = 1;
      var3.hasTransport(var4);
   }
}
