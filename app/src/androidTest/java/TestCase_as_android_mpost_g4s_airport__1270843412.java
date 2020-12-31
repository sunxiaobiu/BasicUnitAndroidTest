import android.app.PendingIntent;
import android.telephony.SmsManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_as_android_mpost_g4s_airport__1270843412 {
   @Test
   public void testCase() throws Exception {
      SmsManager var4 = SmsManager.getDefault();
      String var1 = "android";
      String var2 = "android";
      Object var3 = EasyMock.createMock(PendingIntent.class);
      var4.sendTextMessage(var1, (String)null, var2, (PendingIntent)var3, (PendingIntent)null);
   }
}
