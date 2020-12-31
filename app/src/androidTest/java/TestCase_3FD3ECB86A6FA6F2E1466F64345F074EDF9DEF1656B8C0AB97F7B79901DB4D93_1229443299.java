import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3FD3ECB86A6FA6F2E1466F64345F074EDF9DEF1656B8C0AB97F7B79901DB4D93_1229443299 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ScanResult.class);
      ScanRecord var2 = ((ScanResult)var1).getScanRecord();
      byte[] var3 = var2.getBytes();
   }
}
