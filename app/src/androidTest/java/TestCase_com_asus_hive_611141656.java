import android.bluetooth.le.ScanRecord;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asus_hive_611141656 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ScanRecord.class);
      List var2 = ((ScanRecord)var1).getServiceUuids();
   }
}
