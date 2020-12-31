import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_tsn_mobile_android__1630513713 {
   @Test
   public void testCase() throws Exception {
      BluetoothAdapter var1 = BluetoothAdapter.getDefaultAdapter();
      BluetoothAdapter var2 = var1;
      Context var5 = InstrumentationRegistry.getTargetContext();
      Object var7 = var5.getSystemService("bluetooth");
      BluetoothManager var8 = (BluetoothManager)var7;
      var1 = var8.getAdapter();
      Set var3 = var2.getBondedDevices();
      ArrayList var11 = new ArrayList(var3);
      Object var4 = EasyMock.createMock(List.class);
      Iterator var6 = ((List)var4).iterator();
      var4 = var6.next();
      BluetoothDevice var9 = (BluetoothDevice)var4;
      BluetoothClass var10 = var9.getBluetoothClass();
      int var12 = var10.getMajorDeviceClass();
   }
}
