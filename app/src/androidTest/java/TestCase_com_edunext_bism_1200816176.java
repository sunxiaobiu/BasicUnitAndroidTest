import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_edunext_bism_1200816176 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AccessibilityNodeInfo.class);
      AccessibilityNodeInfoCompat var1 = new AccessibilityNodeInfoCompat(var2);
      var1.addAction(8192);
   }
}
