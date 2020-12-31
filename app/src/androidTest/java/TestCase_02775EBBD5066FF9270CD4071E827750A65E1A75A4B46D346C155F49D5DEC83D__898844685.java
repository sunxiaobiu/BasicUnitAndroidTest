import android.bluetooth.BluetoothAdapter;
import androidx.test.runner.AndroidJUnit4;
import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02775EBBD5066FF9270CD4071E827750A65E1A75A4B46D346C155F49D5DEC83D__898844685 {
   @Test
   public void testCase() throws Exception {
      BluetoothAdapter var2 = BluetoothAdapter.getDefaultAdapter();
      Object var1 = null;
      var2.listenUsingRfcommWithServiceRecord("Sport-Ii", (UUID)var1);
   }
}
