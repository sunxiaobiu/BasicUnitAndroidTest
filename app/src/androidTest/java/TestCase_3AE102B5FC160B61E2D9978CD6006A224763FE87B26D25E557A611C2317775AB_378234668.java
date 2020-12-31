import android.hardware.biometrics.BiometricManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3AE102B5FC160B61E2D9978CD6006A224763FE87B26D25E557A611C2317775AB_378234668 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BiometricManager.class);
      int var2 = ((BiometricManager)var1).canAuthenticate();
   }
}
