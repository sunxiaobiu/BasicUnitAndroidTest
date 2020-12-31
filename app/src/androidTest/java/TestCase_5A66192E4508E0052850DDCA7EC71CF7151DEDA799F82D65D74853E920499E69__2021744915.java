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
public class TestCase_5A66192E4508E0052850DDCA7EC71CF7151DEDA799F82D65D74853E920499E69__2021744915 {
   @Test
   public void testCase() throws Exception {
      AnimatorSet var3 = new AnimatorSet();
      float[] var1 = new float[2];
      Object var2 = EasyMock.createMock(View.class);
      ObjectAnimator var5 = ObjectAnimator.ofFloat(var2, "alpha", var1);
      Builder var4 = var3.play(var5);
      Object var6 = EasyMock.createMock(AnimatorSet.class);
      var4.with((Animator)var6);
   }
}
