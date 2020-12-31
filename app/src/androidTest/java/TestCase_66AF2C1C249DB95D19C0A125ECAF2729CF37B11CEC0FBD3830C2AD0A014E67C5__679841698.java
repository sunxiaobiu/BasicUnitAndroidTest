import android.app.Activity;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_66AF2C1C249DB95D19C0A125ECAF2729CF37B11CEC0FBD3830C2AD0A014E67C5__679841698 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131230933);
      DrawerLayout var4 = (DrawerLayout)var3;
      var4.closeDrawer(8388611, false);
   }

   public TestCase_66AF2C1C249DB95D19C0A125ECAF2729CF37B11CEC0FBD3830C2AD0A014E67C5__679841698() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
