import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_abvio_meter_cycle_1674603422 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SensorEventListener.class);
      Object var1 = EasyMock.createMock(SensorEvent.class);
      ((SensorEventListener)var2).onSensorChanged((SensorEvent)var1);
   }
}
