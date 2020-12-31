import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_tsn_mobile_android__1707374647 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("sensor");
      SensorManager var3 = (SensorManager)var2;
      List var4 = var3.getSensorList(-1);
      Iterator var5 = var4.iterator();
      var2 = var5.next();
      Sensor var6 = (Sensor)var2;
      float var7 = var6.getPower();
   }
}
