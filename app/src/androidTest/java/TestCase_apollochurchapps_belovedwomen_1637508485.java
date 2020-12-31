import android.app.PendingIntent;
import android.support.v7.app.NotificationCompat.MediaStyle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_apollochurchapps_belovedwomen_1637508485 {
   @Test
   public void testCase() throws Exception {
      MediaStyle var2 = new MediaStyle();
      Object var1 = EasyMock.createMock(PendingIntent.class);
      var2.setCancelButtonIntent((PendingIntent)var1);
   }
}
