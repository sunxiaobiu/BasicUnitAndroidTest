import android.bluetooth.BluetoothAdapter;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_silverservice_276044410 {
   @Test
   public void testCase() throws Exception {
      BluetoothAdapter var1 = BluetoothAdapter.getDefaultAdapter();
      int var2 = var1.getProfileConnectionState(1);
   }
}
