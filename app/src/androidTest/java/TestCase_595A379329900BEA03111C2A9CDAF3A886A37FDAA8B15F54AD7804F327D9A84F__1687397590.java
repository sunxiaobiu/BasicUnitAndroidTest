import android.app.NotificationManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_595A379329900BEA03111C2A9CDAF3A886A37FDAA8B15F54AD7804F327D9A84F__1687397590 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(NotificationManager.class);
      String var1 = "android";
      ((NotificationManager)var2).getNotificationChannel(var1);
   }
}
