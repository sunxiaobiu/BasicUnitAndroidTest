import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.TintAwareDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_feller_knx__1972339475 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Drawable.class);
      TintAwareDrawable var3 = (TintAwareDrawable)var2;
      Object var1 = EasyMock.createMock(Mode.class);
      var3.setTintMode((Mode)var1);
   }
}
