import android.net.Credentials;
import android.net.LocalSocket;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_apa_pdfwlclient_mainpost_782328740 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(LocalSocket.class);
      Credentials var2 = ((LocalSocket)var1).getPeerCredentials();
      int var3 = var2.getPid();
   }
}
