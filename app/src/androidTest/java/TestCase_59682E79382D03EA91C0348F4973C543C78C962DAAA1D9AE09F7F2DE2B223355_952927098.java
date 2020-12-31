import android.bluetooth.BluetoothAdapter;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59682E79382D03EA91C0348F4973C543C78C962DAAA1D9AE09F7F2DE2B223355_952927098 {
   @Test
   public void testCase() throws Exception {
      BluetoothAdapter var1 = BluetoothAdapter.getDefaultAdapter();
      var1.startDiscovery();
   }
}
