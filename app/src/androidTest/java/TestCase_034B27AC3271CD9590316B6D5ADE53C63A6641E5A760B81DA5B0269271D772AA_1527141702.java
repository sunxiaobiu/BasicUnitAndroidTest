import android.support.v4.app.NotificationCompat.MessagingStyle;
import android.support.v4.app.NotificationCompat.MessagingStyle.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_034B27AC3271CD9590316B6D5ADE53C63A6641E5A760B81DA5B0269271D772AA_1527141702 {
   @Test
   public void testCase() throws Exception {
      MessagingStyle var2 = new MessagingStyle("Me");
      Object var1 = EasyMock.createMock(Message.class);
      var2.addMessage((Message)var1);
   }
}
