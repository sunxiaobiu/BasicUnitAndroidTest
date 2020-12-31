import android.app.Activity;
import android.view.Menu;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_air_Lovepixelflashlightmobile_586183580 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      byte var1 = 1;
      Object var2 = EasyMock.createMock(View.class);
      Object var3 = EasyMock.createMock(Menu.class);
      var5.onPreparePanel(var1, (View)var2, (Menu)var3);
   }

   public TestCase_air_air_Lovepixelflashlightmobile_586183580() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
