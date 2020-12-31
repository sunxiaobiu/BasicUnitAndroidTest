import android.app.PendingIntent;
import android.support.v4.app.RemoteInput;
import android.support.v4.app.NotificationCompat.Action.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bizlog_triplog_1253152065 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(PendingIntent.class);
      Builder var2 = new Builder(2131165571, "Change activity", (PendingIntent)var1);
      var1 = EasyMock.createMock(RemoteInput.class);
      var2.addRemoteInput((RemoteInput)var1);
   }
}
