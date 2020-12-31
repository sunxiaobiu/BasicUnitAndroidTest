import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59967F61C5E3823924CCAEC45906A9258CD026BAB1C8F1DBC82D6EFCACEC74AE_523061374 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(NotificationManager.class);
      Object var1 = EasyMock.createMock(NotificationChannelGroup.class);
      ((NotificationManager)var2).createNotificationChannelGroup((NotificationChannelGroup)var1);
   }
}
