import android.bluetooth.BluetoothGatt;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_commbank_smartentry_1074147399 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothGatt.class);
      ((BluetoothGatt)var1).requestConnectionPriority(0);
   }
}
