import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1817D879B722E5112D90B0BF3BCB2A69E7A6BFA36CDB341FBF98A82CB780C6D1__1009055545 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("connectivity");
      ConnectivityManager var3 = (ConnectivityManager)var2;
      Network var4 = var3.getBoundNetworkForProcess();
   }
}
