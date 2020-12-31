import android.content.Context;
import android.os.Handler;
import android.support.v4.hardware.fingerprint.FingerprintManagerCompat;
import android.support.v4.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback;
import android.support.v4.hardware.fingerprint.FingerprintManagerCompat.CryptoObject;
import android.support.v4.os.CancellationSignal;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app_1233500454 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      FingerprintManagerCompat var5 = FingerprintManagerCompat.from(var4);
      Object var1 = EasyMock.createMock(CryptoObject.class);
      Object var2 = EasyMock.createMock(CancellationSignal.class);
      Object var3 = EasyMock.createMock(AuthenticationCallback.class);
      var5.authenticate((CryptoObject)var1, 0, (CancellationSignal)var2, (AuthenticationCallback)var3, (Handler)null);
   }
}
