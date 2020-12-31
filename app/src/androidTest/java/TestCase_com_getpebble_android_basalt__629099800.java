import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_getpebble_android_basalt__629099800 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("bluetooth");
      BluetoothManager var4 = (BluetoothManager)var3;
      int[] var1 = new int[1];
      var4.getDevicesMatchingConnectionStates(7, var1);
   }
}
