import android.mtp.MtpDevice;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adobe_lrmobile_247828062 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(MtpDevice.class);
      byte var1 = 1;
      ((MtpDevice)var2).getObjectInfo(var1);
   }
}
