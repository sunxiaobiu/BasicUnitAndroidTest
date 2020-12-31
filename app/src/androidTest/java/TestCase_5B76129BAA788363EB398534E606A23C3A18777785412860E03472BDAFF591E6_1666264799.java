import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B76129BAA788363EB398534E606A23C3A18777785412860E03472BDAFF591E6_1666264799 {
   @Test
   public void testCase() throws Exception {
      BluetoothAdapter var3 = BluetoothAdapter.getDefaultAdapter();
      Object var1 = EasyMock.createMock(Context.class);
      Object var2 = EasyMock.createMock(ServiceListener.class);
      var3.getProfileProxy((Context)var1, (ServiceListener)var2, 1);
   }
}
