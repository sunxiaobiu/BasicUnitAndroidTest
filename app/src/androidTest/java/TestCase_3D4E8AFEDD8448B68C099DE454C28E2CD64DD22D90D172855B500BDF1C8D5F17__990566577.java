import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3D4E8AFEDD8448B68C099DE454C28E2CD64DD22D90D172855B500BDF1C8D5F17__990566577 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      NotificationManagerCompat var2 = NotificationManagerCompat.from(var1);
      var2.deleteNotificationChannel("lightningbug-01");
   }
}
