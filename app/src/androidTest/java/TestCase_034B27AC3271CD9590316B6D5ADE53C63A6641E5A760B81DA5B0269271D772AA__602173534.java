import android.app.Activity;
import android.support.v4.hardware.fingerprint.FingerprintManagerCompat;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_034B27AC3271CD9590316B6D5ADE53C63A6641E5A760B81DA5B0269271D772AA__602173534 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      FingerprintManagerCompat var3 = FingerprintManagerCompat.from(var2);
      boolean var4 = var3.hasEnrolledFingerprints();
   }
}
