import android.animation.ObjectAnimator;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_adam_exercisedictionary_1650397029 {
   @Test
   public void testCase() throws Exception {
      float[] var4 = new float[2];
      Object var1 = EasyMock.createMock(View.class);
      ObjectAnimator var5 = ObjectAnimator.ofFloat(var1, "alpha", var4);
      long var2 = 1L;
      var5.setDuration(var2);
   }
}
