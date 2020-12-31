import android.telephony.PhoneNumberUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_epic_mychart_postexample__1722927940 {
   public static void testCase() throws Exception {
      String var0 = "android";
      var0 = PhoneNumberUtils.normalizeNumber(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
