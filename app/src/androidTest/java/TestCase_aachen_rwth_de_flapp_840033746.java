import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_840033746 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothGatt.class);
      Object var1 = EasyMock.createMock(BluetoothGattDescriptor.class);
      ((BluetoothGatt)var2).readDescriptor((BluetoothGattDescriptor)var1);
   }
}
