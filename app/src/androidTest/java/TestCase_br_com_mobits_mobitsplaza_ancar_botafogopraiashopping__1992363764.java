import android.content.Context;
import android.renderscript.RenderScript;
import android.renderscript.RenderScript.ContextType;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_mobits_mobitsplaza_ancar_botafogopraiashopping__1992363764 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(ContextType.class);
      RenderScript.create((Context)var0, (ContextType)var1, 2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
