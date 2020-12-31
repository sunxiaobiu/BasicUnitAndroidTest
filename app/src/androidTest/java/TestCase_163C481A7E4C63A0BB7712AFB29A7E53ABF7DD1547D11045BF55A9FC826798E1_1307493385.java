import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicConvolve3x3;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_163C481A7E4C63A0BB7712AFB29A7E53ABF7DD1547D11045BF55A9FC826798E1_1307493385 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RenderScript.class);
      Object var1 = EasyMock.createMock(Element.class);
      ScriptIntrinsicConvolve3x3.create((RenderScript)var0, (Element)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
