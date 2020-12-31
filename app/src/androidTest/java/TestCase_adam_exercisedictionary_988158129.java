import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_adam_exercisedictionary_988158129 {
   @Test
   public void testCase() throws Exception {
      AnimatorSet var2 = new AnimatorSet();
      Object var1 = EasyMock.createMock(Animator[].class);
      var2.playTogether((Animator[])var1);
   }
}
