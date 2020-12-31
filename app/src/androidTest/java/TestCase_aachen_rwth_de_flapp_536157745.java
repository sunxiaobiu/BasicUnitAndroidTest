import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_536157745 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("bluetooth");
      BluetoothManager var4 = (BluetoothManager)var3;
      BluetoothAdapter var5 = var4.getAdapter();
      BluetoothLeScanner var1 = var5.getBluetoothLeScanner();
      BluetoothLeScanner var6 = var5.getBluetoothLeScanner();
      var1 = var6;
      var3 = EasyMock.createMock(ScanCallback.class);
      var1.flushPendingScanResults((ScanCallback)var3);
   }
}
