import android.net.http.SslCertificate;
import androidx.test.runner.AndroidJUnit4;
import java.util.Date;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_f5_edge_client_ics__965995686 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SslCertificate.class);
      Date var2 = ((SslCertificate)var1).getValidNotAfterDate();
   }
}
