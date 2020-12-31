import android.graphics.drawable.Drawable;
import androidx.test.runner.AndroidJUnit4;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E3FC499EB23F47B85C8936569ED51B0C0F102CDFB881D1FA21E9C079040E161_36536996 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Drawable.class);
      AnimatedVectorDrawableCompat var3 = (AnimatedVectorDrawableCompat)var2;
      Object var1 = EasyMock.createMock(AnimationCallback.class);
      var3.registerAnimationCallback((AnimationCallback)var1);
   }
}
