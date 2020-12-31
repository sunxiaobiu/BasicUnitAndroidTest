import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_gamegos_solitale__605151530 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("power");
      PowerManager var3 = (PowerManager)var2;
      WakeLock var4 = var3.newWakeLock(805306394, "com.milkmangames.customextensions.android.WakeLock");
   }
}
