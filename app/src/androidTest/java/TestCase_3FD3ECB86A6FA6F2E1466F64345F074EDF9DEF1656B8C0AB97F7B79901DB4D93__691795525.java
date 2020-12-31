import android.app.PendingIntent;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanSettings;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3FD3ECB86A6FA6F2E1466F64345F074EDF9DEF1656B8C0AB97F7B79901DB4D93__691795525 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(BluetoothLeScanner.class);
      Object var1 = null;
      Object var2 = EasyMock.createMock(ScanSettings.class);
      Object var3 = EasyMock.createMock(PendingIntent.class);
      ((BluetoothLeScanner)var4).startScan((List)var1, (ScanSettings)var2, (PendingIntent)var3);
   }
}
