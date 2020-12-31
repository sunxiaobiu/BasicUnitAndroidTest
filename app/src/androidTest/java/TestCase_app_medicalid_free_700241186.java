import android.telephony.PhoneNumberUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free_700241186 {
   public static void testCase() throws Exception {
      String var0 = "android";
      boolean var1 = PhoneNumberUtils.isEmergencyNumber(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
