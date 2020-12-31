import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_595A379329900BEA03111C2A9CDAF3A886A37FDAA8B15F54AD7804F327D9A84F__997710592 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      NotificationManagerCompat var2 = NotificationManagerCompat.from(var1);
      boolean var3 = var2.areNotificationsEnabled();
   }
}
