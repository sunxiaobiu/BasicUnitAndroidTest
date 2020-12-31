import android.content.Context;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ascendapps_timestampcamera_trial_2122650304 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("sensor");
      SensorManager var4 = (SensorManager)var3;
      Object var1 = null;
      var4.unregisterListener((SensorListener)var1, 2);
   }
}
