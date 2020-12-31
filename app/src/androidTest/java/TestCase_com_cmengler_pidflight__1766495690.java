import android.hardware.usb.UsbDevice;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cmengler_pidflight__1766495690 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(UsbDevice.class);
      int var2 = ((UsbDevice)var1).getDeviceProtocol();
   }
}
