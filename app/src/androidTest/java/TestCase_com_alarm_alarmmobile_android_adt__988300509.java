import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alarm_alarmmobile_android_adt__988300509 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService(ShortcutManager.class);
      ShortcutManager var3 = (ShortcutManager)var2;
      List var4 = var3.getPinnedShortcuts();
      Iterator var5 = var4.iterator();
      var2 = var5.next();
      ShortcutInfo var6 = (ShortcutInfo)var2;
      Intent[] var7 = var6.getIntents();
   }
}
