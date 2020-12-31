import android.app.Notification;
import android.support.v4.app.NotificationCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android_1843283908 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Notification.class);
      int var1 = NotificationCompat.getActionCount((Notification)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
