import android.telephony.PhoneNumberUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_callapp_contacts__7226697 {
   public static void testCase() throws Exception {
      String var0 = "android";
      String var1 = "android";
      PhoneNumberUtils.compare(var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
