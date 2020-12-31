import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android_basalt_8095220 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothProfile.class);
      BluetoothHeadset var3 = (BluetoothHeadset)var2;
      int[] var1 = new int[1];
      var3.getDevicesMatchingConnectionStates(var1);
   }
}
