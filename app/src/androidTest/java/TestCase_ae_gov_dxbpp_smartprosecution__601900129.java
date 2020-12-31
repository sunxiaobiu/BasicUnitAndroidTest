import android.content.Context;
import android.os.Vibrator;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dxbpp_smartprosecution__601900129 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("vibrator");
      Vibrator var3 = (Vibrator)var2;
      boolean var4 = var3.hasVibrator();
   }
}
