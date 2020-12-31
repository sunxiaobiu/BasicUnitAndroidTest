import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_digio_retail_beexpresspay__2007625108 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("usb");
      UsbManager var3 = (UsbManager)var2;
      HashMap var4 = var3.getDeviceList();
      Collection var5 = var4.values();
      Iterator var6 = var5.iterator();
      var2 = var6.next();
      UsbDevice var7 = (UsbDevice)var2;
      int var8 = var7.getDeviceSubclass();
   }
}
