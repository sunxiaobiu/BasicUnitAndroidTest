import android.app.Notification;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0429B0ECC96CE87271C465662BF9AD863F3AF2DC92381830CDC6DB7FC3ECC390_1905939932 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      NotificationManagerCompat var4 = NotificationManagerCompat.from(var3);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Notification.class);
      var4.notify("_dt_single", var1, (Notification)var2);
   }
}
