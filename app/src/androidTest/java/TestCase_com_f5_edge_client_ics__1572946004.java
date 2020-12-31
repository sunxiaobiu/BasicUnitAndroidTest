import android.net.http.SslCertificate;
import android.net.http.SslCertificate.DName;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_f5_edge_client_ics__1572946004 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SslCertificate.class);
      DName var2 = ((SslCertificate)var1).getIssuedTo();
      String var3 = var2.getUName();
   }
}
