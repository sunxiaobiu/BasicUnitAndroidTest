import androidx.core.app.NotificationCompat.MessagingStyle;
import androidx.core.app.NotificationCompat.MessagingStyle.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5EEC4C92C3CD83F25D8D42FBCC646A52B2A4FC2B9A62E516F7178B3B8008638B_1515048090 {
   @Test
   public void testCase() throws Exception {
      MessagingStyle var2 = new MessagingStyle("Me");
      Object var1 = EasyMock.createMock(Message.class);
      var2.addMessage((Message)var1);
   }
}
