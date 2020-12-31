import android.bluetooth.BluetoothSocket;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BAB0C36DE173161EFC9A8AEAB7E11AD0CB55C4A2CC3F6383C35DDE47C978818_559187418 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothSocket.class);
      int var2 = ((BluetoothSocket)var1).getMaxTransmitPacketSize();
   }
}
