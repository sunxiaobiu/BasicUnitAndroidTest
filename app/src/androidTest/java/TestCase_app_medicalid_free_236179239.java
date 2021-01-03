import android.telephony.SmsManager;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free_236179239 {
   @Test
   public void testCase() throws Exception {
      SmsManager var4 = SmsManager.getDefault();
      String var1 = "android";
      Object var2 = null;
      Object var3 = null;
      var4.sendMultipartTextMessage(var1, (String)"android", (ArrayList)var2, (ArrayList)var3, (ArrayList)null);
   }
}
