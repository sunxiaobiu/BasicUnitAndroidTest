import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bhvr_realfeelgolf_1864651103 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      AssetManager var2 = var1.getAssets();
      XmlResourceParser var3 = var2.openXmlResourceParser("AndroidManifest.xml");
      int var4 = var3.nextToken();
   }
}
