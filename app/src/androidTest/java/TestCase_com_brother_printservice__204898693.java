import android.print.PrinterId;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_brother_printservice__204898693 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(PrinterId.class);
      String var2 = ((PrinterId)var1).getLocalId();
   }
}
