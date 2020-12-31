import android.app.Notification;
import android.support.v4.app.NotificationCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android__1285440855 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Notification.class);
      byte var1 = 1;
      NotificationCompat.getAction((Notification)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
