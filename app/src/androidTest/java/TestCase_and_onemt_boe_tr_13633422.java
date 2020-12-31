import android.animation.ValueAnimator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_and_onemt_boe_tr_13633422 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ValueAnimator.class);
      var1 = ((ValueAnimator)var1).getAnimatedValue("ALPHA");
   }
}
