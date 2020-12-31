import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_10DC23BB0AD7AC6BA2D9313062D53E1165CA88835630DAAA8B14CCA167EF9835_18918152 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      FragmentActivity var4 = (FragmentActivity)var3;
      FragmentManager var5 = var4.getSupportFragmentManager();
      Object var1 = null;
      var5.registerFragmentLifecycleCallbacks((FragmentLifecycleCallbacks)var1, true);
   }
}
