import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cn_wps_moffice_eng__1847443752 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Resources var3 = var2.getResources();
      Bitmap var4 = BitmapFactory.decodeResource(var3, 2130840096);
      BitmapDrawable var1 = new BitmapDrawable(var4);
      var1.setDither(true);
   }
}
