import android.content.Context;
import android.security.KeyChain;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arcye_monstervpn_523065080 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      String var1 = "android";
      KeyChain.getPrivateKey((Context)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
