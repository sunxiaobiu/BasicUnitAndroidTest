import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_no_nrksuper_app_259260433 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AnimatorListener.class);
      Object var1 = EasyMock.createMock(Animator.class);
      ((AnimatorListener)var2).onAnimationEnd((Animator)var1);
   }
}
