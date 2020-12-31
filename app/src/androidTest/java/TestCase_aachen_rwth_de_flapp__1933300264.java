import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__1933300264 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothGatt.class);
      Object var1 = EasyMock.createMock(BluetoothGattCharacteristic.class);
      ((BluetoothGatt)var2).readCharacteristic((BluetoothGattCharacteristic)var1);
   }
}
