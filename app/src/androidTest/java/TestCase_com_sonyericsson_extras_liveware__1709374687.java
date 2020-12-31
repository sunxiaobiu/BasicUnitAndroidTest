import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_sonyericsson_extras_liveware__1709374687 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothProfile.class);
      Object var1 = EasyMock.createMock(BluetoothDevice.class);
      ((BluetoothProfile)var2).getConnectionState((BluetoothDevice)var1);
   }
}
