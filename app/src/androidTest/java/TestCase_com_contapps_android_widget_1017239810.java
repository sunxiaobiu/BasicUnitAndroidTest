import android.telephony.PhoneNumberUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_contapps_android_widget_1017239810 {
   public static void testCase() throws Exception {
      char var0 = ' ';
      boolean var1 = PhoneNumberUtils.isReallyDialable(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
