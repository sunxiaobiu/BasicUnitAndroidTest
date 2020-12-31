import android.content.Context;
import android.support.v4.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_MSPMobile__901339557 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Builder var3 = new Builder(var2);
      boolean var1 = true;
      var3.setOnlyAlertOnce(var1);
   }
}
