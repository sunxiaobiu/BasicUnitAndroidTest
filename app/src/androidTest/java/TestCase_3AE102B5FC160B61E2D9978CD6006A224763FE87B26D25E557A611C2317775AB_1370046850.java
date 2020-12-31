import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3AE102B5FC160B61E2D9978CD6006A224763FE87B26D25E557A611C2317775AB_1370046850 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("accessibility");
      AccessibilityManager var3 = (AccessibilityManager)var2;
      List var4 = var3.getEnabledAccessibilityServiceList(1);
      Iterator var5 = var4.iterator();
      var2 = var5.next();
      AccessibilityServiceInfo var6 = (AccessibilityServiceInfo)var2;
      String var7 = var6.getSettingsActivityName();
   }
}
