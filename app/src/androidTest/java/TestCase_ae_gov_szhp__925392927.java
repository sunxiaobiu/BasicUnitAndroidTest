import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_szhp__925392927 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("connectivity");
      ConnectivityManager var3 = (ConnectivityManager)var2;
      NetworkInfo var4 = var3.getActiveNetworkInfo();
      boolean var5 = var4.isConnectedOrConnecting();
   }
}
