import android.app.Notification;
import android.content.Context;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_apollochurchapps_belovedwomen__1786350480 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1);
      BigTextStyle var5 = new BigTextStyle(var2);
      Notification var3 = var5.build();
      String var4 = var3.toString();
   }
}
