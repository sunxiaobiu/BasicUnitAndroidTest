import android.support.v7.widget.ViewUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_rbfa_255914464 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ViewGroup.class);
      ViewUtils.makeOptionalFitsSystemWindows((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
