import android.app.Notification;
import android.support.v4.app.NotificationCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_141009A5CB19BAF5C50C745C6FA13ACBEC9EBBBFD5F2446ED27528690FB4D10C__101382680 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Notification.class);
      boolean var1 = NotificationCompat.isGroupSummary((Notification)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
