import android.mtp.MtpObjectInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adobe_lrmobile__1381378643 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MtpObjectInfo.class);
      int var2 = ((MtpObjectInfo)var1).getObjectHandle();
   }
}
