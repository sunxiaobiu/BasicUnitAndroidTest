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
public class TestCase_606C5B2363B6BC7B3E119DE2A26F4A89BE97A85AC1B5F7B6E1CC0A7D6F8A43ED__1732940826 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("usb");
      UsbManager var5 = (UsbManager)var4;
      Object var1 = EasyMock.createMock(UsbDevice.class);
      UsbDeviceConnection var6 = var5.openDevice((UsbDevice)var1);
      byte var7 = 1;
      byte[] var2 = new byte[1];
      var6.controlTransfer(192, 144, 0, 67, var2, var7, 1000);
   }
}
