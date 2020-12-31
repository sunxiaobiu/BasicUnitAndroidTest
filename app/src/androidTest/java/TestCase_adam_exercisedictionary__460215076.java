import android.animation.ObjectAnimator;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_adam_exercisedictionary__460215076 {
   @Test
   public void testCase() throws Exception {
      float[] var2 = new float[2];
      Object var1 = EasyMock.createMock(View.class);
      ObjectAnimator var3 = ObjectAnimator.ofFloat(var1, "alpha", var2);
      var3.start();
   }
}
