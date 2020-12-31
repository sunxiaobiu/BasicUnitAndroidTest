import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_calculator_folder_lock__168872803 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(FingerprintManager.class);
      Object var1 = EasyMock.createMock(CryptoObject.class);
      Object var2 = EasyMock.createMock(CancellationSignal.class);
      Object var3 = null;
      ((FingerprintManager)var4).authenticate((CryptoObject)var1, (CancellationSignal)var2, 0, (AuthenticationCallback)var3, (Handler)null);
   }
}
