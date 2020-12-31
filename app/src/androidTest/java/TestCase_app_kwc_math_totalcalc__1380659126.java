import android.content.Context;
import android.text.ClipboardManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_kwc_math_totalcalc__1380659126 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("clipboard");
      ClipboardManager var3 = (ClipboardManager)var2;
      CharSequence var4 = var3.getText();
   }
}
