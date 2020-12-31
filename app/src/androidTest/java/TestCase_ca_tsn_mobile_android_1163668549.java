import android.bluetooth.BluetoothProfile;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_tsn_mobile_android_1163668549 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothProfile.class);
      List var2 = ((BluetoothProfile)var1).getConnectedDevices();
   }
}
