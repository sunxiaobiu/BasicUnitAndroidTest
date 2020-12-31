import android.app.Notification;
import android.support.v4.app.NotificationCompat.WearableExtender;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android__270526531 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Notification.class);
      WearableExtender var1 = new WearableExtender((Notification)var2);
      List var3 = var1.getActions();
   }
}
