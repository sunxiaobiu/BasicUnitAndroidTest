import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_feller_knx_161435162 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      DrawableCompat.getLayoutDirection((Drawable)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
