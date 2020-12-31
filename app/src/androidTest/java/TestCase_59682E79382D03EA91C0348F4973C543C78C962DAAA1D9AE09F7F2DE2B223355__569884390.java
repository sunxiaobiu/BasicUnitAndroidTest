import android.bluetooth.BluetoothDevice;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59682E79382D03EA91C0348F4973C543C78C962DAAA1D9AE09F7F2DE2B223355__569884390 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothDevice.class);
      String var2 = ((BluetoothDevice)var1).getAddress();
   }
}
