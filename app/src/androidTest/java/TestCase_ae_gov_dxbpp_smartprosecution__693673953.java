import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dxbpp_smartprosecution__693673953 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RenderScript.class);
      Object var1 = EasyMock.createMock(Element.class);
      ScriptIntrinsicBlur.create((RenderScript)var0, (Element)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
