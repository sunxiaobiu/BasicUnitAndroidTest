import android.app.Notification;
import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_MSPMobile__1114493832 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      NotificationManagerCompat var4 = NotificationManagerCompat.from(var3);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Notification.class);
      var4.notify("_dt_group", var1, (Notification)var2);
   }
}
