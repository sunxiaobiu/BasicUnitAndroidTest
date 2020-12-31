import android.net.LocalSocket;
import androidx.test.runner.AndroidJUnit4;
import java.io.FileDescriptor;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arcye_monstervpn_1143994661 {
   @Test
   public void testCase() throws Exception {
      LocalSocket var1 = new LocalSocket();
      FileDescriptor var2 = var1.getFileDescriptor();
   }
}
