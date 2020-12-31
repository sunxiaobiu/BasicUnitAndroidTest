import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_018050FA67BFA249436AE40583EBBAEFB1FB5F7B053D13ADA4F027C56676383C_1412594777 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("connectivity");
      ConnectivityManager var3 = (ConnectivityManager)var2;
      Network[] var4 = var3.getAllNetworks();
   }
}
