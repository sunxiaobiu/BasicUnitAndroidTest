import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.OnNetworkActiveListener;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0758A49CB1A80E521FF9BD600016AFF9FB212B458362852CF61C0A1F429BEF28__1590602844 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("connectivity");
      ConnectivityManager var4 = (ConnectivityManager)var3;
      Object var1 = EasyMock.createMock(OnNetworkActiveListener.class);
      var4.addDefaultNetworkActiveListener((OnNetworkActiveListener)var1);
   }
}
