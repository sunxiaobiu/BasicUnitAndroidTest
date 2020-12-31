import android.net.ProxyInfo;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_1133085406 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      ProxyInfo var1 = ProxyInfo.buildPacProxy((Uri)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
