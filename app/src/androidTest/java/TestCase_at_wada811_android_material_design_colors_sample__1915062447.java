import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_wada811_android_material_design_colors_sample__1915062447 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("clipboard");
      ClipboardManager var4 = (ClipboardManager)var3;
      Object var1 = EasyMock.createMock(ClipData.class);
      var4.setPrimaryClip((ClipData)var1);
   }
}
