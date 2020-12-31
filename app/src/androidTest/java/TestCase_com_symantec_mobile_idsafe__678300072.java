import android.app.assist.AssistStructure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_symantec_mobile_idsafe__678300072 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AssistStructure.class);
      byte var1 = 1;
      ((AssistStructure)var2).getWindowNodeAt(var1);
   }
}
