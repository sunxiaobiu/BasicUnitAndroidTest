import android.app.PendingIntent;
import android.support.v4.app.NotificationCompatBase.Action;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arion_calendar__1208755864 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Action.class);
      PendingIntent var2 = ((Action)var1).getActionIntent();
   }
}
