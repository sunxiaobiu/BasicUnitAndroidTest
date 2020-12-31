import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_glympse_android_glympse_586620120 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothSocket.class);
      BluetoothDevice var2 = ((BluetoothSocket)var1).getRemoteDevice();
   }
}
