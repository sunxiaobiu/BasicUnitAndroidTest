import android.app.PendingIntent;
import android.bluetooth.le.BluetoothLeScanner;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3FD3ECB86A6FA6F2E1466F64345F074EDF9DEF1656B8C0AB97F7B79901DB4D93__229340150 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(BluetoothLeScanner.class);
      Object var1 = EasyMock.createMock(PendingIntent.class);
      ((BluetoothLeScanner)var2).stopScan((PendingIntent)var1);
   }
}
