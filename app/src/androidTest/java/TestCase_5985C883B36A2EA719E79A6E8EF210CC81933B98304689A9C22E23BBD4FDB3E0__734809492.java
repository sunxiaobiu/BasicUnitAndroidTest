import android.app.NotificationManager;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0__734809492 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(NotificationManager.class);
      Object var1 = null;
      ((NotificationManager)var2).createNotificationChannels((List)var1);
   }
}
