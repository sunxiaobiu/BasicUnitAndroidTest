import android.app.Application;
import android.hardware.fingerprint.FingerprintManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_ingdirect_android_1383498342 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Application.class);
      var1 = ((Application)var1).getSystemService(FingerprintManager.class);
   }
}
