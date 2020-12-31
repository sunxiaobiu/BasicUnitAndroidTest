import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_375949042 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ConnectivityManager.class);
      NetworkInfo var2 = ((ConnectivityManager)var1).getActiveNetworkInfo();
      int var3 = var2.getType();
   }
}
