import android.app.NotificationManager;
import android.app.NotificationManager.Policy;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cabooze_buzzoff__75303001 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("notification");
      NotificationManager var4 = (NotificationManager)var3;
      Policy var5 = var4.getNotificationPolicy();
      Object var1 = EasyMock.createMock(Policy.class);
      var5.equals(var1);
   }
}
