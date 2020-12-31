import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_MSPMobile_95027644 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      NotificationManagerCompat var3 = NotificationManagerCompat.from(var2);
      byte var1 = 1;
      var3.cancel("_dt_single", var1);
   }
}
