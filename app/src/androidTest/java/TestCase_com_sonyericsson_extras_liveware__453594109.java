import android.bluetooth.BluetoothAdapter;
import androidx.test.runner.AndroidJUnit4;
import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_sonyericsson_extras_liveware__453594109 {
   @Test
   public void testCase() throws Exception {
      BluetoothAdapter var3 = BluetoothAdapter.getDefaultAdapter();
      String var1 = "android";
      Object var2 = null;
      var3.listenUsingInsecureRfcommWithServiceRecord(var1, (UUID)var2);
   }
}
