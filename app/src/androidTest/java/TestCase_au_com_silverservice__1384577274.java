import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_silverservice__1384577274 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("bluetooth");
      BluetoothManager var3 = (BluetoothManager)var2;
      List var4 = var3.getConnectedDevices(7);
   }
}
