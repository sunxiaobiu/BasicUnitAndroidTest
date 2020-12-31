import android.support.v4.app.NotificationCompat.Action;
import android.support.v4.app.NotificationCompat.WearableExtender;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bizlog_triplog_1558452130 {
   @Test
   public void testCase() throws Exception {
      WearableExtender var2 = new WearableExtender();
      Object var1 = EasyMock.createMock(Action.class);
      var2.addAction((Action)var1);
   }
}
