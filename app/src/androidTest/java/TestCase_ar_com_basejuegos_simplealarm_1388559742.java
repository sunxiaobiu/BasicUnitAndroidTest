import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_basejuegos_simplealarm_1388559742 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      TaskStackBuilder var2 = TaskStackBuilder.create(var1);
      PendingIntent var3 = var2.getPendingIntent(0, 134217728);
   }
}
