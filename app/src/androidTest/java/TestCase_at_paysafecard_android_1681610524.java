import android.security.KeyChain;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_paysafecard_android_1681610524 {
   public static void testCase() throws Exception {
      String var0 = "android";
      boolean var1 = KeyChain.isKeyAlgorithmSupported(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
