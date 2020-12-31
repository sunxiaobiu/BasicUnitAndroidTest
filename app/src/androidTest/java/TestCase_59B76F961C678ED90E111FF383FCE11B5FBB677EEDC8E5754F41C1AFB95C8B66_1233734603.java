import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59B76F961C678ED90E111FF383FCE11B5FBB677EEDC8E5754F41C1AFB95C8B66_1233734603 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131362033);
      DrawerLayout var5 = (DrawerLayout)var4;
      Object var1 = EasyMock.createMock(ListView.class);
      var5.closeDrawer((View)var1);
   }

   public TestCase_59B76F961C678ED90E111FF383FCE11B5FBB677EEDC8E5754F41C1AFB95C8B66_1233734603() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
