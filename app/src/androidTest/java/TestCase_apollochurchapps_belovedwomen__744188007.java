import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_apollochurchapps_belovedwomen__744188007 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131558685);
      DrawerLayout var4 = (DrawerLayout)var3;
      var4.setScrimColor(Integer.MIN_VALUE);
   }

   public TestCase_apollochurchapps_belovedwomen__744188007() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
