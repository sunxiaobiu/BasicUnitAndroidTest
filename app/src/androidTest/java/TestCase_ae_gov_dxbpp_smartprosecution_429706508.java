import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.Type;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dxbpp_smartprosecution_429706508 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RenderScript.class);
      Object var1 = EasyMock.createMock(Type.class);
      Allocation.createTyped((RenderScript)var0, (Type)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
