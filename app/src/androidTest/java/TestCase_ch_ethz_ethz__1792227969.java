import android.net.SSLCertificateSocketFactory;
import androidx.test.runner.AndroidJUnit4;
import javax.net.SocketFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_ethz_ethz__1792227969 {
   public static void testCase() throws Exception {
      SocketFactory var0 = SSLCertificateSocketFactory.getDefault(0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
