import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__497539744 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Resources var3 = var2.getResources();
      AssetManager var4 = var3.getAssets();
      byte var1 = 1;
      var4.openXmlResourceParser(var1, "AndroidManifest.xml");
   }
}
