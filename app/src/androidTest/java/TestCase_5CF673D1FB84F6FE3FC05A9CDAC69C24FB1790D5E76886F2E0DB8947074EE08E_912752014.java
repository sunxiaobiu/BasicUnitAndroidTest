import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5CF673D1FB84F6FE3FC05A9CDAC69C24FB1790D5E76886F2E0DB8947074EE08E_912752014 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(SensorManager.class);
      Object var1 = EasyMock.createMock(SensorEventListener.class);
      Object var2 = EasyMock.createMock(Sensor.class);
      byte var3 = 1;
      ((SensorManager)var4).registerListener((SensorEventListener)var1, (Sensor)var2, var3, var3);
   }
}
