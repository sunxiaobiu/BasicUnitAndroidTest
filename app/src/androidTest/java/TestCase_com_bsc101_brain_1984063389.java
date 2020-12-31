import android.app.PendingIntent;
import android.telephony.SmsManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bsc101_brain_1984063389 {
   @Test
   public void testCase() throws Exception {
      SmsManager var5 = SmsManager.getDefault();
      String var1 = "android";
      byte[] var2 = new byte[1];
      Object var3 = EasyMock.createMock(PendingIntent.class);
      Object var4 = EasyMock.createMock(PendingIntent.class);
      var5.sendDataMessage(var1, (String)null, (short)8801, var2, (PendingIntent)var3, (PendingIntent)var4);
   }
}
