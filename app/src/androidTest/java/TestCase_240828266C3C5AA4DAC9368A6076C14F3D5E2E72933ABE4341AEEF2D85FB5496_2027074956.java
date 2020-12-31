import android.net.DnsResolver;
import android.net.Network;
import android.net.DnsResolver.Callback;
import android.os.CancellationSignal;
import androidx.test.runner.AndroidJUnit4;
import java.util.concurrent.Executor;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_240828266C3C5AA4DAC9368A6076C14F3D5E2E72933ABE4341AEEF2D85FB5496_2027074956 {
   @Test
   public void testCase() throws Exception {
      DnsResolver var6 = DnsResolver.getInstance();
      Object var1 = EasyMock.createMock(Network.class);
      String var2 = "android";
      Object var3 = null;
      Object var4 = EasyMock.createMock(CancellationSignal.class);
      Object var5 = null;
      var6.query((Network)var1, var2, 1, (Executor)var3, (CancellationSignal)var4, (Callback)var5);
   }
}
