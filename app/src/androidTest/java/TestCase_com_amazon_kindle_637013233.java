import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.view.accessibility.AccessibilityManager;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amazon_kindle_637013233 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(AccessibilityManager.class);
      List var1 = AccessibilityManagerCompat.getEnabledAccessibilityServiceList((AccessibilityManager)var0, 1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
