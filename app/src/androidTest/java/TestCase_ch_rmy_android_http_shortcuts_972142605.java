import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_rmy_android_http_shortcuts_972142605 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService(ShortcutManager.class);
      ShortcutManager var4 = (ShortcutManager)var3;
      Object var1 = EasyMock.createMock(ShortcutInfo.class);
      var4.createShortcutResultIntent((ShortcutInfo)var1);
   }
}
