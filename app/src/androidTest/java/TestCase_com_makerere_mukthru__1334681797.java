import android.app.Activity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_makerere_mukthru__1334681797 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131230828);
      SwipeRefreshLayout var4 = (SwipeRefreshLayout)var3;
      var4.setColorScheme(2131296286, 2131296287, 2131296288, 2131296289);
   }

   public TestCase_com_makerere_mukthru__1334681797() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
