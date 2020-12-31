import android.bluetooth.BluetoothGattCharacteristic;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__887395323 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothGattCharacteristic.class);
      Integer var2 = ((BluetoothGattCharacteristic)var1).getIntValue(18, 0);
   }
}
