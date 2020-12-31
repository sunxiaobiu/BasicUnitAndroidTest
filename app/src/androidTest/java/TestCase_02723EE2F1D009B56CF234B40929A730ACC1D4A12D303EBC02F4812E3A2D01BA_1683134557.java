import android.net.Network;
import androidx.test.runner.AndroidJUnit4;
import javax.net.SocketFactory;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02723EE2F1D009B56CF234B40929A730ACC1D4A12D303EBC02F4812E3A2D01BA_1683134557 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Network.class);
      SocketFactory var2 = ((Network)var1).getSocketFactory();
   }
}
