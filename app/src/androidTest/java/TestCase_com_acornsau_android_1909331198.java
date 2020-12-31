import android.net.SSLCertificateSocketFactory;
import androidx.test.runner.AndroidJUnit4;
import javax.net.SocketFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_acornsau_android_1909331198 {
   public static void testCase() throws Exception {
      SocketFactory var0 = SSLCertificateSocketFactory.getDefault();
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
