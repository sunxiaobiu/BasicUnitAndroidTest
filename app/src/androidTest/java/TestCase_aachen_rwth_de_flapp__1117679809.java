import android.bluetooth.BluetoothGattCharacteristic;
import androidx.test.runner.AndroidJUnit4;
import java.util.UUID;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__1117679809 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothGattCharacteristic.class);
      Object var1 = null;
      ((BluetoothGattCharacteristic)var2).getDescriptor((UUID)var1);
   }
}
