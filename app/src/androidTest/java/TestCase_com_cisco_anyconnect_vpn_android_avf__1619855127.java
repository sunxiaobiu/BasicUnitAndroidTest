import android.content.ContentResolver;
import android.provider.Settings.Secure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cisco_anyconnect_vpn_android_avf__1619855127 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      String var1 = "android";
      Secure.putString((ContentResolver)var0, "http_proxy", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
