import android.app.Activity;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ADFB6C4805A44A3E6B0B021CCE86A3BA14B6194D991C1E50B4F48EBBA17F3ED__1289524179 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(16908290);
      ViewGroup var5 = (ViewGroup)var4;
      var4 = var5.getChildAt(0);
      CoordinatorLayout var6 = (CoordinatorLayout)var4;
      byte var1 = 1;
      var6.setStatusBarBackgroundColor(var1);
   }
}
