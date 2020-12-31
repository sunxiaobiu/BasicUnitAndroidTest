import android.animation.ValueAnimator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_andrewsoft_vc_2077224690 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(ValueAnimator.class);
      long var1 = ((ValueAnimator)var3).getCurrentPlayTime();
   }
}
