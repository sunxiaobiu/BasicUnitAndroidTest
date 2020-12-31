import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_67995CE716C14587D8A44C137BA3229E8797AC3C269379DBC262FC9E7C5AD084__1712272166 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(FrameLayout.class);
      ViewCompat.requestApplyInsets((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
