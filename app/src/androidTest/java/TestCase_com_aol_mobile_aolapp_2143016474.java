import android.content.Context;
import android.support.v7.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aol_mobile_aolapp_2143016474 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1);
      String var3 = "android";
      var2.setContentTitle(var3);
   }
}
