import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_adam_exercisedictionary_1534357932 {
   @Test
   public void testCase() throws Exception {
      AnimatorSet var2 = new AnimatorSet();
      Object var1 = EasyMock.createMock(AccelerateDecelerateInterpolator.class);
      var2.setInterpolator((TimeInterpolator)var1);
   }
}
