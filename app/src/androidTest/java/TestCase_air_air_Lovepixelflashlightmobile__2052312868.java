import android.app.Activity;
import android.view.WindowManager.LayoutParams;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_air_Lovepixelflashlightmobile__2052312868 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var1 = EasyMock.createMock(LayoutParams.class);
      var3.onWindowAttributesChanged((LayoutParams)var1);
   }

   public TestCase_air_air_Lovepixelflashlightmobile__2052312868() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
