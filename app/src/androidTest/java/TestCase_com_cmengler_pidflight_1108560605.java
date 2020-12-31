import android.app.PendingIntent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cmengler_pidflight_1108560605 {
   @Test
   public void testCase() throws Exception {
      MyService var3 = new MyService();
      Object var4 = var3.getSystemService("usb");
      UsbManager var5 = (UsbManager)var4;
      Object var1 = EasyMock.createMock(UsbDevice.class);
      Object var2 = EasyMock.createMock(PendingIntent.class);
      var5.requestPermission((UsbDevice)var1, (PendingIntent)var2);
   }
}
