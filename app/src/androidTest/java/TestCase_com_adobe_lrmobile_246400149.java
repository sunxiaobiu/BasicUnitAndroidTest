import android.mtp.MtpObjectInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adobe_lrmobile_246400149 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(MtpObjectInfo.class);
      long var1 = ((MtpObjectInfo)var3).getDateCreated();
   }
}
