import android.mtp.MtpDevice;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adobe_lrmobile_300562614 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(MtpDevice.class);
      byte var1 = 1;
      byte var2 = 1;
      ((MtpDevice)var3).getObjectHandles(var1, 0, var2);
   }
}
