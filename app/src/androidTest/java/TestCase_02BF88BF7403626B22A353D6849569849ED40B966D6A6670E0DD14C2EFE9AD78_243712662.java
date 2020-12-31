import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet.Builder;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02BF88BF7403626B22A353D6849569849ED40B966D6A6670E0DD14C2EFE9AD78_243712662 {
   @Test
   public void testCase() throws Exception {
      AnimatorSet var3 = new AnimatorSet();
      float[] var1 = new float[2];
      Object var2 = EasyMock.createMock(View.class);
      ObjectAnimator var5 = ObjectAnimator.ofFloat(var2, "scaleY", var1);
      Builder var4 = var3.play(var5);
      Object var6 = EasyMock.createMock(ObjectAnimator.class);
      var4.before((Animator)var6);
   }
}
