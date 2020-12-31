import android.app.PendingIntent;
import android.telephony.SmsManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_paystay__168892502 {
   @Test
   public void testCase() throws Exception {
      SmsManager var2 = SmsManager.getDefault();
      Object var1 = EasyMock.createMock(PendingIntent.class);
      var2.createAppSpecificSmsToken((PendingIntent)var1);
   }
}
