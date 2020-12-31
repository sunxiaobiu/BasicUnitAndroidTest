import android.content.ClipboardManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AA2DA89E6EE2D56C9A553F54D825A2D17EF90C27F17D5D23D347E9977CAC9AD_378622182 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("clipboard");
      ClipboardManager var3 = (ClipboardManager)var2;
      CharSequence var4 = var3.getText();
   }
}
