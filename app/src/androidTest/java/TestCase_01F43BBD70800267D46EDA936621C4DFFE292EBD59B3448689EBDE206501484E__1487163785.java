import android.app.PendingIntent;
import androidx.core.app.NotificationCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E__1487163785 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Builder.class);
      String var1 = "android";
      Object var2 = EasyMock.createMock(PendingIntent.class);
      ((Builder)var3).addAction(2131231599, var1, (PendingIntent)var2);
   }
}
