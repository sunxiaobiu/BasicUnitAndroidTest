import android.app.Activity;
import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.Window;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5CA793F2BAB1860CEB2A6228890189D8E7A6051CE15C75FD5F193E6AF701E80D__1065211175 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Window var4 = var3.getWindow();
      Transition var5 = var4.getEnterTransition();
      Object var1 = EasyMock.createMock(TransitionListener.class);
      var5.removeListener((TransitionListener)var1);
   }

   public TestCase_5CA793F2BAB1860CEB2A6228890189D8E7A6051CE15C75FD5F193E6AF701E80D__1065211175() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
