import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_67BBBDFBC1F9CD27EBF07988705B042FDB0FAD5DDE7EF2D5D691792CA7CE13E8_1353561092 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      View var1 = var4.findViewById(2131296734);
      DrawerLayout var5 = (DrawerLayout)var1;
      ActionBarDrawerToggle var2 = new ActionBarDrawerToggle(var4, var5, (Toolbar)null, 2131886132, 2131886132);
      Object var6 = EasyMock.createMock(Configuration.class);
      var2.onConfigurationChanged((Configuration)var6);
   }

   public TestCase_67BBBDFBC1F9CD27EBF07988705B042FDB0FAD5DDE7EF2D5D691792CA7CE13E8_1353561092() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
