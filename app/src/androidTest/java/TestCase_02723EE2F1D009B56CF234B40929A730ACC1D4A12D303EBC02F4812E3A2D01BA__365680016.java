import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.nsd.NsdManager.RegistrationListener;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02723EE2F1D009B56CF234B40929A730ACC1D4A12D303EBC02F4812E3A2D01BA__365680016 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("servicediscovery");
      NsdManager var5 = (NsdManager)var4;
      Object var1 = EasyMock.createMock(NsdServiceInfo.class);
      Object var2 = EasyMock.createMock(RegistrationListener.class);
      var5.registerService((NsdServiceInfo)var1, 1, (RegistrationListener)var2);
   }
}
