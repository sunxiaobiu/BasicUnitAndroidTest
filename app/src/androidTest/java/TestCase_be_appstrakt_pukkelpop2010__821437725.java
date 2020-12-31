import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_appstrakt_pukkelpop2010__821437725 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("bluetooth");
      BluetoothManager var3 = (BluetoothManager)var2;
      BluetoothAdapter var4 = var3.getAdapter();
      BluetoothLeAdvertiser var5 = var4.getBluetoothLeAdvertiser();
   }
}
