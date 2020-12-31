import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_zoetropic_free__1883338869 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      View var1 = var5.findViewById(2131230924);
      Toolbar var2 = (Toolbar)var1;
      var1 = var5.findViewById(2131230839);
      DrawerLayout var3 = (DrawerLayout)var1;
      ActionBarDrawerToggle var7 = new ActionBarDrawerToggle(var5, var3, var2, 2131624071, 2131624070);
      Object var6 = EasyMock.createMock(Drawable.class);
      var7.setHomeAsUpIndicator((Drawable)var6);
   }

   public TestCase_br_com_zoetropic_free__1883338869() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
