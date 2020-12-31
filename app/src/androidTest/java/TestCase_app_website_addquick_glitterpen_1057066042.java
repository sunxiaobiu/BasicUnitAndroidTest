import android.content.Context;
import android.graphics.BitmapRegionDecoder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_website_addquick_glitterpen_1057066042 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      String var1 = "selected.image";
      File var3 = var2.getFileStreamPath(var1);
      var1 = var3.getAbsolutePath();
      BitmapRegionDecoder var4 = BitmapRegionDecoder.newInstance(var1, false);
      var4.recycle();
   }
}
