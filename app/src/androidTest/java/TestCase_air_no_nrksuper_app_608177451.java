import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_no_nrksuper_app_608177451 {
   @Test
   public void testCase() throws Exception {
      AnimatorSet var2 = new AnimatorSet();
      Object var1 = EasyMock.createMock(Animator.class);
      var2.play((Animator)var1);
   }
}
