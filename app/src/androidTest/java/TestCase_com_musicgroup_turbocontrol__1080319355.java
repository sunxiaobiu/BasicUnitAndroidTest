import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_musicgroup_turbocontrol__1080319355 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(BluetoothDevice.class);
      Object var1 = EasyMock.createMock(Context.class);
      Object var2 = EasyMock.createMock(BluetoothGattCallback.class);
      ((BluetoothDevice)var3).connectGatt((Context)var1, false, (BluetoothGattCallback)var2, 2);
   }
}
