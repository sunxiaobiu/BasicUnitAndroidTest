import android.bluetooth.le.ScanFilter.Builder;
import android.os.ParcelUuid;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__1428479212 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(ParcelUuid.class);
      var2.setServiceUuid((ParcelUuid)var1);
   }
}
