import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_biblica_c4c_creative_624935882 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      ImageView var1 = new ImageView(var2);
      Drawable var3 = var1.getDrawable();
      BitmapDrawable var4 = (BitmapDrawable)var3;
      var4.setAntiAlias(true);
   }
}
