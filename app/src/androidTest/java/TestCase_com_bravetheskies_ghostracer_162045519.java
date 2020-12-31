import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bravetheskies_ghostracer_162045519 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("sensor");
      SensorManager var3 = (SensorManager)var2;
      Sensor var4 = var3.getDefaultSensor(6);
      int var5 = var4.getFifoMaxEventCount();
   }
}
