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
public class TestCase_5A59B0637EF6D1132F732097D9745F9F431BC00C859319EC3BF87A7C27C4F838__1164792659 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296920);
      SwipeRefreshLayout var4 = (SwipeRefreshLayout)var3;
      var4.setDistanceToTriggerSync(20);
   }

   public TestCase_5A59B0637EF6D1132F732097D9745F9F431BC00C859319EC3BF87A7C27C4F838__1164792659() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
