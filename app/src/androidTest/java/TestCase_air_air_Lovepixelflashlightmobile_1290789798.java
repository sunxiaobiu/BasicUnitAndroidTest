import android.app.Activity;
import android.view.MenuItem;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_air_Lovepixelflashlightmobile_1290789798 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      byte var1 = 1;
      Object var2 = EasyMock.createMock(MenuItem.class);
      var4.onMenuItemSelected(var1, (MenuItem)var2);
   }

   public TestCase_air_air_Lovepixelflashlightmobile_1290789798() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}