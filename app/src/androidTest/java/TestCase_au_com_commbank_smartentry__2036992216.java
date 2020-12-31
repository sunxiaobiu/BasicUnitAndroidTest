import android.bluetooth.BluetoothAdapter;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_commbank_smartentry__2036992216 {
   @Test
   public void testCase() throws Exception {
      BluetoothAdapter var1 = BluetoothAdapter.getDefaultAdapter();
      var1.enable();
   }
}
