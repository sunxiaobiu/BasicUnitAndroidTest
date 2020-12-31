import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__1898284417 {
   @Test
   public void testCase() throws Exception {
      int[] var2 = new int[2];
      Object var1 = EasyMock.createMock(AnimationDrawable.class);
      ObjectAnimator var3 = ObjectAnimator.ofInt(var1, "currentIndex", var2);
      var3.reverse();
   }
}
