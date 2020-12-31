import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_RustyLake_CubeEscapeTheCave__1506919084 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      ProgressBar var1 = new ProgressBar(var2, (AttributeSet)null, 16842872);
      Drawable var3 = var1.getProgressDrawable();
      LayerDrawable var4 = (LayerDrawable)var3;
      Object var5 = EasyMock.createMock(ColorDrawable.class);
      var4.setDrawableByLayerId(16908288, (Drawable)var5);
   }
}
