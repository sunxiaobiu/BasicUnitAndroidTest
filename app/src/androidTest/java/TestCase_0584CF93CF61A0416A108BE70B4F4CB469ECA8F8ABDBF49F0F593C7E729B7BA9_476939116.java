import android.animation.LayoutTransition;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0584CF93CF61A0416A108BE70B4F4CB469ECA8F8ABDBF49F0F593C7E729B7BA9_476939116 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131362248);
      ViewGroup var4 = (ViewGroup)var3;
      LayoutTransition var5 = var4.getLayoutTransition();
      var5.enableTransitionType(4);
   }

   public TestCase_0584CF93CF61A0416A108BE70B4F4CB469ECA8F8ABDBF49F0F593C7E729B7BA9_476939116() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
