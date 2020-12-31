import android.app.Notification;
import androidx.core.app.NotificationCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0ACF81F8DD4B003FF4E1FD1853E5ADA53C5BA4955D7784EC4246AF8F2687AED8_300196214 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Notification.class);
      boolean var1 = NotificationCompat.isGroupSummary((Notification)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
