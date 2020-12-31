import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_010862F494B1F968314349B519AA35DE59000CFC8B5866DA7BF3C1E81A242945_1463539867 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("sensor");
      SensorManager var4 = (SensorManager)var3;
      Object var1 = null;
      var4.unregisterListener((SensorEventListener)var1);
   }
}
