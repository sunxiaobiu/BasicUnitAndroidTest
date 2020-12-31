import android.bluetooth.BluetoothGattCharacteristic;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cc_makeblock_makeblock_746291122 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothGattCharacteristic.class);
      int var2 = ((BluetoothGattCharacteristic)var1).getProperties();
   }
}
