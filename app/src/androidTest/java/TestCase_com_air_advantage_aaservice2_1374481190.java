import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_air_advantage_aaservice2_1374481190 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("usb");
      UsbManager var4 = (UsbManager)var3;
      Object var1 = EasyMock.createMock(UsbAccessory.class);
      var4.hasPermission((UsbAccessory)var1);
   }
}
