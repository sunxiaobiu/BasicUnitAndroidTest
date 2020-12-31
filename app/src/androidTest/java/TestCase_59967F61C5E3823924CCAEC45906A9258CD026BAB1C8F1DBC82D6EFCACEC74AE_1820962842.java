import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59967F61C5E3823924CCAEC45906A9258CD026BAB1C8F1DBC82D6EFCACEC74AE_1820962842 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("notification");
      NotificationManager var3 = (NotificationManager)var2;
      StatusBarNotification[] var4 = var3.getActiveNotifications();
   }
}
