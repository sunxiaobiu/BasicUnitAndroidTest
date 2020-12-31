import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cba_shiraz_152800046 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("usb");
      UsbManager var4 = (UsbManager)var3;
      Object var1 = EasyMock.createMock(UsbDevice.class);
      UsbDeviceConnection var5 = var4.openDevice((UsbDevice)var1);
      var5.close();
   }
}
