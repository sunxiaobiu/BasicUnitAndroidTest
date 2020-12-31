import android.security.keystore.KeyProtection;
import android.security.keystore.KeyProtection.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_danfoss_devi_smartapp_1900323439 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder(3);
      String[] var1 = new String[1];
      var2 = var2.setBlockModes(var1);
      KeyProtection var3 = var2.build();
   }
}
