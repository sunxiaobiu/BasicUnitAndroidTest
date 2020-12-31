import android.app.Notification;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__947420266 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Notification.class);
      Bundle var1 = NotificationCompat.getExtras((Notification)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
