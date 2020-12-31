import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_abvio_meter_cycle__213833307 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SensorEventListener.class);
      Object var1 = EasyMock.createMock(Sensor.class);
      byte var2 = 1;
      ((SensorEventListener)var3).onAccuracyChanged((Sensor)var1, var2);
   }
}
