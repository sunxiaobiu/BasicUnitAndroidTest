import android.security.KeyChain;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app__25210261 {
   public static void testCase() throws Exception {
      boolean var0 = KeyChain.isBoundKeyAlgorithm("RSA");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
