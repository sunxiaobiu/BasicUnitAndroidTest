import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2E0FB7053A0C0E8569FE2DB52582C7852D1DEBB982391D736A4C5AC4B379FCEE__1121985951 {
   @Test
   public void testCase() throws Exception {
      StateListAnimator var3 = new StateListAnimator();
      int[] var1 = new int[1];
      Object var2 = EasyMock.createMock(ObjectAnimator.class);
      var3.addState(var1, (Animator)var2);
   }
}
