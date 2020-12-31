import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.VectorDrawableCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_etsy_android_1961162479 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Theme var2 = var1.getTheme();
      Resources var5 = var1.getResources();
      VectorDrawableCompat var3 = VectorDrawableCompat.create(var5, 2131231221, var2);
      Drawable var4 = var3.mutate();
   }
}
