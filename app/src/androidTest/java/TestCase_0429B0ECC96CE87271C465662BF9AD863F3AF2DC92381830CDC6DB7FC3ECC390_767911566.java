import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0429B0ECC96CE87271C465662BF9AD863F3AF2DC92381830CDC6DB7FC3ECC390_767911566 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      NotificationManagerCompat var3 = NotificationManagerCompat.from(var2);
      byte var1 = 1;
      var3.cancel("_dt_single", var1);
   }
}
