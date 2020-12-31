import android.net.LocalSocket;
import androidx.test.runner.AndroidJUnit4;
import java.io.FileDescriptor;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cisco_anyconnect_vpn_android_avf__1999536996 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(LocalSocket.class);
      FileDescriptor[] var2 = ((LocalSocket)var1).getAncillaryFileDescriptors();
   }
}
