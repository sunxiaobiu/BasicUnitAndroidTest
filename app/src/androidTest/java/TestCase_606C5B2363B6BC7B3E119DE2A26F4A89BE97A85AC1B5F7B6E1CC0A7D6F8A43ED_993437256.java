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
public class TestCase_606C5B2363B6BC7B3E119DE2A26F4A89BE97A85AC1B5F7B6E1CC0A7D6F8A43ED_993437256 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("usb");
      UsbManager var4 = (UsbManager)var3;
      Object var1 = EasyMock.createMock(UsbDevice.class);
      UsbDeviceConnection var5 = var4.openDevice((UsbDevice)var1);
      String var6 = var5.getSerial();
   }
}
