import android.animation.LayoutTransition;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amlcurran_jump_1108548907 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131558500);
      ViewGroup var5 = (ViewGroup)var4;
      ViewParent var6 = var5.getParent();
      var5 = (ViewGroup)var6;
      LayoutTransition var7 = var5.getLayoutTransition();
      Object var1 = EasyMock.createMock(FastOutSlowInInterpolator.class);
      var7.setInterpolator(0, (TimeInterpolator)var1);
   }

   public TestCase_com_amlcurran_jump_1108548907() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
