import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothProfile;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android_basalt__1042255002 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothProfile.class);
      BluetoothA2dp var3 = (BluetoothA2dp)var2;
      int[] var1 = new int[1];
      var3.getDevicesMatchingConnectionStates(var1);
   }
}
