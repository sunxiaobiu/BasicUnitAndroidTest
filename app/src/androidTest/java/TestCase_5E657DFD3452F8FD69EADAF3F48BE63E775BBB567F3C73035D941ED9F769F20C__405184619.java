import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__405184619 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      DrawableCompat.jumpToCurrentState((Drawable)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
