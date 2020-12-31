import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_chesskid_347733933 {
   @Test
   public void testCase() throws Exception {
      LayoutTransition var2 = new LayoutTransition();
      Object var1 = EasyMock.createMock(ObjectAnimator.class);
      var2.setAnimator(2, (Animator)var1);
   }
}
