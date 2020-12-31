import android.util.Base64;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adsi_kioware_client_mobile_app__1444296165 {
   public static void testCase() throws Exception {
      byte[] var0 = new byte[1];
      byte var1 = 1;
      Base64.encode(var0, 0, var1, 2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
