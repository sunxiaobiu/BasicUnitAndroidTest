import android.bluetooth.le.ScanFilter.Builder;
import android.os.ParcelUuid;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_crestron_andros_893966636 {
   @Test
   public void testCase() throws Exception {
      Builder var3 = new Builder();
      Object var1 = EasyMock.createMock(ParcelUuid.class);
      Object var2 = EasyMock.createMock(ParcelUuid.class);
      var3.setServiceUuid((ParcelUuid)var1, (ParcelUuid)var2);
   }
}
