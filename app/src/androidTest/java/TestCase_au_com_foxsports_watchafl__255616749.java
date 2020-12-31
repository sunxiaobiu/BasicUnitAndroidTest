import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_foxsports_watchafl__255616749 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("connectivity");
      ConnectivityManager var4 = (ConnectivityManager)var3;
      Object var1 = EasyMock.createMock(Network.class);
      var4.getLinkProperties((Network)var1);
   }
}
