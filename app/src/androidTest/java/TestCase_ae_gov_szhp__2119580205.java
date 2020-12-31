import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_szhp__2119580205 {
   @Test
   public void testCase() throws Exception {
      int[] var2 = new int[2];
      ValueAnimator var3 = ValueAnimator.ofInt(var2);
      Object var1 = EasyMock.createMock(LinearInterpolator.class);
      var3.setInterpolator((TimeInterpolator)var1);
   }
}
