import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_1400734802 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("bluetooth");
      BluetoothManager var4 = (BluetoothManager)var3;
      BluetoothAdapter var5 = var4.getAdapter();
      Object var1 = EasyMock.createMock(LeScanCallback.class);
      var5.startLeScan((LeScanCallback)var1);
   }
}
