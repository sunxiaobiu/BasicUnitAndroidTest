import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_szhp_190920334 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      View var1 = var5.findViewById(2131230981);
      Toolbar var2 = (Toolbar)var1;
      var1 = var5.findViewById(2131230790);
      DrawerLayout var6 = (DrawerLayout)var1;
      ActionBarDrawerToggle var3 = new ActionBarDrawerToggle(var5, var6, var2, 2131492895, 2131492895);
      var3.syncState();
   }

   public TestCase_ae_gov_szhp_190920334() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
