import android.bluetooth.BluetoothDevice;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__1150219961 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothDevice.class);
      boolean var2 = ((BluetoothDevice)var1).createBond();
   }
}
