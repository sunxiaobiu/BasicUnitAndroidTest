import android.net.http.SslCertificate;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_tux_client__623265717 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SslCertificate.class);
      Bundle var1 = SslCertificate.saveState((SslCertificate)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
