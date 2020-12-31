import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BA8FFA7080D1ED2E80D3170613DD18405ED9807737D981B4C21757DC09C9882__17507834 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(FrameLayout.class);
      Object var1 = EasyMock.createMock(AccessibilityDelegateCompat.class);
      ViewCompat.setAccessibilityDelegate((View)var0, (AccessibilityDelegateCompat)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
