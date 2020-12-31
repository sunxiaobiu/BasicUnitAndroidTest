import android.bluetooth.BluetoothHeadset;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B76129BAA788363EB398534E606A23C3A18777785412860E03472BDAFF591E6_1274435330 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(BluetoothHeadset.class);
      List var2 = ((BluetoothHeadset)var1).getConnectedDevices();
   }
}
