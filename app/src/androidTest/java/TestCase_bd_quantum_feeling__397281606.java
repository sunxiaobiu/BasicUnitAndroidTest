import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_bd_quantum_feeling__397281606 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("connectivity");
      ConnectivityManager var3 = (ConnectivityManager)var2;
      NetworkInfo var4 = var3.getActiveNetworkInfo();
      State var5 = var4.getState();
      String var6 = var5.toString();
   }
}
