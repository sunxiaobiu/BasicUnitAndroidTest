import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ciudadanovirtual_tartagal__1974744465 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131558628);
      FloatingActionButton var5 = (FloatingActionButton)var4;
      byte var1 = 1;
      var5.setBackgroundColor(var1);
   }

   public TestCase_ciudadanovirtual_tartagal__1974744465() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
