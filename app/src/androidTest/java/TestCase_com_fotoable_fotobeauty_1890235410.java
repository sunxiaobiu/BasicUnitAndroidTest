import android.support.v4.animation.AnimatorCompatHelper;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fotoable_fotobeauty_1890235410 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      AnimatorCompatHelper.clearInterpolator((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
