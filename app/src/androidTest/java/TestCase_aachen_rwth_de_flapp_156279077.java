import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_156279077 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothGatt.class);
      BluetoothDevice var2 = ((BluetoothGatt)var1).getDevice();
   }
}
