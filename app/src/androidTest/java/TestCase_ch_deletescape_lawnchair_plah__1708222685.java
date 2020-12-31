import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__1708222685 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ValueAnimator.class);
      Object var1 = null;
      ((ValueAnimator)var2).removeUpdateListener((AnimatorUpdateListener)var1);
   }
}
