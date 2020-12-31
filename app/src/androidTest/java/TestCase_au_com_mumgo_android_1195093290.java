import android.telephony.PhoneNumberUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_mumgo_android_1195093290 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = PhoneNumberUtils.stripSeparators(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
