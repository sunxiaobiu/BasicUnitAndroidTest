import android.security.keystore.KeyGenParameterSpec.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3FD3ECB86A6FA6F2E1466F64345F074EDF9DEF1656B8C0AB97F7B79901DB4D93__813312511 {
   @Test
   public void testCase() throws Exception {
      Builder var1 = new Builder("DbWrappingKey", 3);
      var1 = var1.setUnlockedDeviceRequired(true);
   }
}
