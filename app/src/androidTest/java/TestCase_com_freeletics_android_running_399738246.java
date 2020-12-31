import android.animation.LayoutTransition;
import android.animation.LayoutTransition.TransitionListener;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_freeletics_android_running_399738246 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ViewGroup.class);
      LayoutTransition var3 = ((ViewGroup)var2).getLayoutTransition();
      Object var1 = null;
      var3.removeTransitionListener((TransitionListener)var1);
   }
}
