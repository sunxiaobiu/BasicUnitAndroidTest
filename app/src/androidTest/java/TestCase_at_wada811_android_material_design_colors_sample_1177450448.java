import android.content.Context;
import android.text.ClipboardManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_wada811_android_material_design_colors_sample_1177450448 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("clipboard");
      ClipboardManager var4 = (ClipboardManager)var3;
      String var1 = "android";
      var4.setText(var1);
   }
}
