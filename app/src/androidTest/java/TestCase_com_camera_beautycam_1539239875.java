import android.app.PendingIntent;
import android.content.Context;
import android.support.v7.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_camera_beautycam_1539239875 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1);
      Object var3 = EasyMock.createMock(PendingIntent.class);
      var2.setDeleteIntent((PendingIntent)var3);
   }
}
