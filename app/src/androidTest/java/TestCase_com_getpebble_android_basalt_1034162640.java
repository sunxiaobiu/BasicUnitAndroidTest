import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHealth;
import android.bluetooth.BluetoothProfile;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android_basalt_1034162640 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothProfile.class);
      BluetoothHealth var3 = (BluetoothHealth)var2;
      Object var1 = EasyMock.createMock(BluetoothDevice.class);
      var3.getConnectionState((BluetoothDevice)var1);
   }
}
