import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arcye_monstervpn__758627981 {
   @Test
   public void testCase() throws Exception {
      LocalSocket var2 = new LocalSocket();
      Object var1 = EasyMock.createMock(LocalSocketAddress.class);
      var2.bind((LocalSocketAddress)var1);
   }
}
