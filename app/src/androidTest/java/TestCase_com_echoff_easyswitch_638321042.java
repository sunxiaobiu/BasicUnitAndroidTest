import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_echoff_easyswitch_638321042 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      AccessibilityService var3 = (AccessibilityService)var2;
      byte var1 = 1;
      var3.performGlobalAction(var1);
   }
}
