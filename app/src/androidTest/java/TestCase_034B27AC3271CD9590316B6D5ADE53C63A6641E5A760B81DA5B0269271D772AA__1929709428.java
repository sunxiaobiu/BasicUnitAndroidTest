import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_034B27AC3271CD9590316B6D5ADE53C63A6641E5A760B81DA5B0269271D772AA__1929709428 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("power");
      PowerManager var3 = (PowerManager)var2;
      WakeLock var4 = var3.newWakeLock(268435462, "LocalNotification");
      var4.release(1);
   }
}
