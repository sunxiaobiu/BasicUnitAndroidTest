import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.Allocation.MipmapControl;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dxbpp_smartprosecution__674365340 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RenderScript.class);
      Object var1 = EasyMock.createMock(Bitmap.class);
      Object var2 = EasyMock.createMock(MipmapControl.class);
      Allocation.createFromBitmap((RenderScript)var0, (Bitmap)var1, (MipmapControl)var2, 1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
