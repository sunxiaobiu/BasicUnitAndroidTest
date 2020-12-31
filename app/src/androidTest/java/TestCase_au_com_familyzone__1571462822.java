import android.content.Intent;
import android.security.KeyChain;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_familyzone__1571462822 {
   public static void testCase() throws Exception {
      Intent var0 = KeyChain.createInstallIntent();
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
