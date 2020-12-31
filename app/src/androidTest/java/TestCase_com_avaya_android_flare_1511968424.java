import android.net.ProxyInfo;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_avaya_android_flare_1511968424 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ProxyInfo.class);
      Uri var2 = ((ProxyInfo)var1).getPacFileUrl();
   }
}
