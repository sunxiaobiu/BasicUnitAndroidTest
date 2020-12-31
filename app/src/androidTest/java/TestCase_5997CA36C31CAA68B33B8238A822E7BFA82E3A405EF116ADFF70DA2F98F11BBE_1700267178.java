import android.animation.TimeInterpolator;
import android.transition.Transition;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5997CA36C31CAA68B33B8238A822E7BFA82E3A405EF116ADFF70DA2F98F11BBE_1700267178 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Transition.class);
      Object var1 = EasyMock.createMock(AccelerateDecelerateInterpolator.class);
      ((Transition)var2).setInterpolator((TimeInterpolator)var1);
   }
}
