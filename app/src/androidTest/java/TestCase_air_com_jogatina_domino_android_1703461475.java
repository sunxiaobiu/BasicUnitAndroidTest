import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_jogatina_domino_android_1703461475 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("servicediscovery");
      NsdManager var4 = (NsdManager)var3;
      Object var1 = EasyMock.createMock(RegistrationListener.class);
      var4.unregisterService((RegistrationListener)var1);
   }
}
