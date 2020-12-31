import android.telephony.PhoneNumberUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_hb_dialer_free__246543161 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = PhoneNumberUtils.extractPostDialPortion(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
