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
public class TestCase_5C764BC66BB60CBC6DE6C638F44CFEFAC0BECFE7F99946A87654848F116D57CA_1612204186 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131361906);
      FloatingActionButton var4 = (FloatingActionButton)var3;
      var4.setVisibility(0);
   }

   public TestCase_5C764BC66BB60CBC6DE6C638F44CFEFAC0BECFE7F99946A87654848F116D57CA_1612204186() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
