import android.telephony.SmsManager;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free__1202097471 {
   @Test
   public void testCase() throws Exception {
      SmsManager var2 = SmsManager.getDefault();
      String var1 = "android";
      var2.divideMessage(var1);
   }
}
