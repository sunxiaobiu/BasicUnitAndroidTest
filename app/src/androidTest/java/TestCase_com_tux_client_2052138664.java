import android.net.http.SslCertificate;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_tux_client_2052138664 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bundle.class);
      SslCertificate var1 = SslCertificate.restoreState((Bundle)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
