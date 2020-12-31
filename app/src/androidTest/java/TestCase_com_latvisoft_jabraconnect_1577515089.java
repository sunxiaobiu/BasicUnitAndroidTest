import android.bluetooth.BluetoothAdapter;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_latvisoft_jabraconnect_1577515089 {
   public static void testCase() throws Exception {
      String var0 = "android";
      boolean var1 = BluetoothAdapter.checkBluetoothAddress(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
