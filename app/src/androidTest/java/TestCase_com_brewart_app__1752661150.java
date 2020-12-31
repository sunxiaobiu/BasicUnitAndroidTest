import android.net.ConnectivityManager;
import android.net.Network;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_brewart_app__1752661150 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(ConnectivityManager.class);
      Network var4 = ((ConnectivityManager)var3).getBoundNetworkForProcess();
      long var1 = var4.getNetworkHandle();
   }
}
