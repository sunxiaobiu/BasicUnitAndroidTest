import android.media.MediaDrm;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_erosnow__1658406737 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaDrm.class);
      String var2 = ((MediaDrm)var1).getPropertyString("securityLevel");
   }
}
