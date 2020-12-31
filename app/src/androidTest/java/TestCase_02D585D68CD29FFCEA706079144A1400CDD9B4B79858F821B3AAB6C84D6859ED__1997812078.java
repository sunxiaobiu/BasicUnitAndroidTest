import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02D585D68CD29FFCEA706079144A1400CDD9B4B79858F821B3AAB6C84D6859ED__1997812078 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      View var1 = var5.findViewById(2131296550);
      Toolbar var2 = (Toolbar)var1;
      var1 = var5.findViewById(2131296374);
      DrawerLayout var6 = (DrawerLayout)var1;
      ActionBarDrawerToggle var3 = new ActionBarDrawerToggle(var5, var6, var2, 2131689733, 2131689732);
      var3.setDrawerIndicatorEnabled(true);
   }

   public TestCase_02D585D68CD29FFCEA706079144A1400CDD9B4B79858F821B3AAB6C84D6859ED__1997812078() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
