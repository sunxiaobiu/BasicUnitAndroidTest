import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appsontoast_ultimatecardock_574757101 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothHeadset.class);
      Object var1 = EasyMock.createMock(BluetoothDevice.class);
      ((BluetoothHeadset)var2).stopVoiceRecognition((BluetoothDevice)var1);
   }
}
