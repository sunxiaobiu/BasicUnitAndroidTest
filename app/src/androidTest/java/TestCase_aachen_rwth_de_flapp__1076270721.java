import android.bluetooth.le.ScanFilter.Builder;
import android.os.ParcelUuid;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__1076270721 {
   @Test
   public void testCase() throws Exception {
      Builder var4 = new Builder();
      Object var1 = EasyMock.createMock(ParcelUuid.class);
      byte[] var2 = new byte[1];
      byte[] var3 = new byte[1];
      var4.setServiceData((ParcelUuid)var1, var2, var3);
   }
}
