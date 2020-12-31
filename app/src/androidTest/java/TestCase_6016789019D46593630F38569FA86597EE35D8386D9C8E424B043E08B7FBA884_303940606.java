import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.Type;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6016789019D46593630F38569FA86597EE35D8386D9C8E424B043E08B7FBA884_303940606 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RenderScript.class);
      Object var1 = EasyMock.createMock(Element.class);
      byte var2 = 1;
      byte var3 = 1;
      Type.createXY((RenderScript)var0, (Element)var1, var2, var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
