import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_eziosoft_cleanflight_flasher__1054150435 {
   @Test
   public void testCase() throws Exception {
      UsbRequest var3 = new UsbRequest();
      Object var1 = EasyMock.createMock(UsbDeviceConnection.class);
      Object var2 = EasyMock.createMock(UsbEndpoint.class);
      var3.initialize((UsbDeviceConnection)var1, (UsbEndpoint)var2);
   }
}
