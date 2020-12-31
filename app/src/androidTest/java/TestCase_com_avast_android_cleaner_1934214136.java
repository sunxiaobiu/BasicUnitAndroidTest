import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_avast_android_cleaner_1934214136 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AccessibilityNodeInfoCompat.class);
      Object var1 = EasyMock.createMock(AccessibilityNodeInfoCompat.class);
      ((AccessibilityNodeInfoCompat)var2).equals(var1);
   }
}
