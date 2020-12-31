import android.hardware.usb.UsbEndpoint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aws_apps_usbDeviceEnumerator__1507840134 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(UsbEndpoint.class);
      int var2 = ((UsbEndpoint)var1).getDirection();
   }
}
