import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_mobits_mobitsplaza_ancar_botafogopraiashopping__881211046 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RenderScript.class);
      Object var1 = EasyMock.createMock(Bitmap.class);
      Allocation.createFromBitmap((RenderScript)var0, (Bitmap)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
