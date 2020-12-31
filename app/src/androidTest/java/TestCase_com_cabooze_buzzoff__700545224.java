import android.app.NotificationManager;
import android.app.NotificationManager.Policy;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cabooze_buzzoff__700545224 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("notification");
      NotificationManager var3 = (NotificationManager)var2;
      Policy var4 = var3.getNotificationPolicy();
      String var5 = var4.toString();
   }
}
