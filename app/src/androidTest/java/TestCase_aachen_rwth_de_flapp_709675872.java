import android.bluetooth.BluetoothGattCharacteristic;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_709675872 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothGattCharacteristic.class);
      byte var1 = 1;
      ((BluetoothGattCharacteristic)var2).setValue(var1, 20, 0);
   }
}
