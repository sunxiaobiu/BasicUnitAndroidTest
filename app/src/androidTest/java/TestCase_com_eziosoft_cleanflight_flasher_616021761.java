import android.hardware.usb.UsbRequest;
import androidx.test.runner.AndroidJUnit4;
import java.nio.ByteBuffer;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_eziosoft_cleanflight_flasher_616021761 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(UsbRequest.class);
      Object var1 = null;
      ((UsbRequest)var2).queue((ByteBuffer)var1, 16384);
   }
}
