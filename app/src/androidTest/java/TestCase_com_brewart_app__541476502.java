import android.net.ConnectivityManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_brewart_app__541476502 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ConnectivityManager.class);
      ((ConnectivityManager)var1).setNetworkPreference(1);
   }
}
