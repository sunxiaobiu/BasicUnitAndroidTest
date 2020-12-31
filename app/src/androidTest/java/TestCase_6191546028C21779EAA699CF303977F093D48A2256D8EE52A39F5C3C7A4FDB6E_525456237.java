import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6191546028C21779EAA699CF303977F093D48A2256D8EE52A39F5C3C7A4FDB6E_525456237 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(UsbManager.class);
      UsbAccessory[] var3 = ((UsbManager)var2).getAccessoryList();
      UsbAccessory var4 = var3[0];
      Object var1 = EasyMock.createMock(UsbAccessory.class);
      var4.equals(var1);
   }
}
