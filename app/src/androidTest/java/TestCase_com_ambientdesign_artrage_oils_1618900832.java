import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ambientdesign_artrage_oils_1618900832 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Resources var2 = var1.getResources();
      Drawable var3 = var2.getDrawable(2131165203);
      NinePatchDrawable var4 = (NinePatchDrawable)var3;
      var4.setDither(true);
   }
}
