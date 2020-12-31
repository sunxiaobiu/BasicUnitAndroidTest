import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_no_nrksuper_app_801683828 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayerDrawable.class);
      Drawable var3 = ((LayerDrawable)var2).findDrawableByLayerId(2131362254);
      GradientDrawable var4 = (GradientDrawable)var3;
      Object var1 = EasyMock.createMock(Mode.class);
      var4.setTintMode((Mode)var1);
   }
}
