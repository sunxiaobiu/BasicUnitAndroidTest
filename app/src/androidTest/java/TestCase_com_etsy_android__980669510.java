import android.content.Context;
import android.content.pm.ShortcutManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_etsy_android__980669510 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService(ShortcutManager.class);
      ShortcutManager var5 = (ShortcutManager)var4;
      Object var1 = null;
      String var2 = "android";
      var5.disableShortcuts((List)var1, var2);
   }
}
