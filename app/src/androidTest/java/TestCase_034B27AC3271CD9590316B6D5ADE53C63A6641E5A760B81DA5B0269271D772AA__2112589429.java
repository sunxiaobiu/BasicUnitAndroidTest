import android.app.Activity;
import android.content.Context;
import android.support.v4.hardware.fingerprint.FingerprintManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_034B27AC3271CD9590316B6D5ADE53C63A6641E5A760B81DA5B0269271D772AA__2112589429 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      FingerprintManagerCompat var1 = FingerprintManagerCompat.from((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
