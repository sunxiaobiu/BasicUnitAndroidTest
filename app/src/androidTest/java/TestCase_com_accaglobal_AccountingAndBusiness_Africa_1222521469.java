import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_accaglobal_AccountingAndBusiness_Africa_1222521469 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RenderScript.class);
      Object var1 = EasyMock.createMock(Element.class);
      byte var2 = 1;
      Allocation.createSized((RenderScript)var0, (Element)var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
