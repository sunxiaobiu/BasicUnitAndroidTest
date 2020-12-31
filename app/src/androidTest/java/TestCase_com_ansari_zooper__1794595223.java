import android.animation.TimeInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.transition.Slide;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ansari_zooper__1794595223 {
   @Test
   public void testCase() throws Exception {
      Slide var2 = new Slide();
      Object var1 = EasyMock.createMock(FastOutSlowInInterpolator.class);
      var2.setInterpolator((TimeInterpolator)var1);
   }
}
