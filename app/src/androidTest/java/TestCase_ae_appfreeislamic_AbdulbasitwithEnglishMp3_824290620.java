import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_824290620 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("notification");
      NotificationManager var4 = (NotificationManager)var3;
      Object var1 = EasyMock.createMock(NotificationChannel.class);
      var4.createNotificationChannel((NotificationChannel)var1);
   }
}
