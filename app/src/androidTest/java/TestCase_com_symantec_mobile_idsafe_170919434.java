import android.app.assist.AssistStructure.ViewNode;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_symantec_mobile_idsafe_170919434 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ViewNode.class);
      byte var1 = 1;
      ((ViewNode)var2).getChildAt(var1);
   }
}
