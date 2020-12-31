import android.app.PendingIntent;
import android.telephony.gsm.SmsManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_makerere_mukthru__267769016 {
   @Test
   public void testCase() throws Exception {
      SmsManager var5 = SmsManager.getDefault();
      String var1 = "android";
      String var2 = "android";
      Object var3 = EasyMock.createMock(PendingIntent.class);
      Object var4 = EasyMock.createMock(PendingIntent.class);
      var5.sendTextMessage(var1, (String)null, var2, (PendingIntent)var3, (PendingIntent)var4);
   }
}
