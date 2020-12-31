import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5C2279088A20C640DE6532DA8168AC472A2277EB951E252288FC3E0FADDA6D0A__1504596892 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131231018);
      DrawerLayout var5 = (DrawerLayout)var4;
      Object var1 = EasyMock.createMock(FrameLayout.class);
      var5.isDrawerOpen((View)var1);
   }

   public TestCase_5C2279088A20C640DE6532DA8168AC472A2277EB951E252288FC3E0FADDA6D0A__1504596892() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
