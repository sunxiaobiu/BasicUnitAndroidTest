import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C_279643719 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      byte var1 = 1;
      byte var2 = 1;
      byte var3 = 1;
      byte var4 = 1;
      DrawableCompat.setHotspotBounds((Drawable)var0, var1, var2, var3, var4);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
