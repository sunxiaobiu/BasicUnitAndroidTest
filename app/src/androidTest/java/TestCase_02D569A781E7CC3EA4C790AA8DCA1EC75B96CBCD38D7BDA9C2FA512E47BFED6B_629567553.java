import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02D569A781E7CC3EA4C790AA8DCA1EC75B96CBCD38D7BDA9C2FA512E47BFED6B_629567553 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      boolean var1 = ViewCompat.isAttachedToWindow((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
