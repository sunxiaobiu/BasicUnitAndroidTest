import android.net.SSLCertificateSocketFactory;
import androidx.test.runner.AndroidJUnit4;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fsck_k9_1782656701 {
   @Test
   public void testCase() throws Exception {
      SSLContext var3 = SSLContext.getInstance("TLS");
      SSLSocketFactory var4 = var3.getSocketFactory();
      Object var5 = EasyMock.createMock(SSLSocketFactory.class);
      SSLCertificateSocketFactory var6 = (SSLCertificateSocketFactory)var5;
      Object var1 = null;
      String var2 = "android";
      var6.setHostname((Socket)var1, var2);
   }
}
