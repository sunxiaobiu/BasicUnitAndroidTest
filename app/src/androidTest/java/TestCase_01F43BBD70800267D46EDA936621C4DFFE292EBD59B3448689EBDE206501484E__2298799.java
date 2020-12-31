import android.app.PendingIntent;
import androidx.media.app.NotificationCompat.MediaStyle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E__2298799 {
   @Test
   public void testCase() throws Exception {
      MediaStyle var2 = new MediaStyle();
      Object var1 = EasyMock.createMock(PendingIntent.class);
      var2.setCancelButtonIntent((PendingIntent)var1);
   }
}
