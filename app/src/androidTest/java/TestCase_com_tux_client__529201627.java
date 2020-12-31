import android.net.http.SslCertificate;
import android.net.http.SslCertificate.DName;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_tux_client__529201627 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SslCertificate.class);
      DName var2 = ((SslCertificate)var1).getIssuedBy();
      String var3 = var2.getDName();
   }
}
