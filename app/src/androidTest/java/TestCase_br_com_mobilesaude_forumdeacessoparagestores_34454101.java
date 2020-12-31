import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_mobilesaude_forumdeacessoparagestores_34454101 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      View var1 = var5.findViewById(2131231367);
      Toolbar var2 = (Toolbar)var1;
      var1 = var5.findViewById(2131230861);
      DrawerLayout var7 = (DrawerLayout)var1;
      ActionBarDrawerToggle var3 = new ActionBarDrawerToggle(var5, var7, var2, 2131689682, 2131689681);
      DrawerArrowDrawable var6 = var3.getDrawerArrowDrawable();
      byte var8 = 1;
      var6.setColor(var8);
   }

   public TestCase_br_com_mobilesaude_forumdeacessoparagestores_34454101() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
