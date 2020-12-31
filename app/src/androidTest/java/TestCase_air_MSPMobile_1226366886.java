import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_MSPMobile_1226366886 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Builder var5 = new Builder(var4);
      byte var1 = 1;
      String var2 = "android";
      Object var3 = EasyMock.createMock(PendingIntent.class);
      var5.addAction(var1, var2, (PendingIntent)var3);
   }
}
