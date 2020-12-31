import android.app.Activity;
import android.content.res.Configuration;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_608924B6393224547B305940BB04163D06411A8F8E12BBC0CCD9F084906135A6__233925634 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var1 = EasyMock.createMock(Configuration.class);
      var3.onConfigurationChanged((Configuration)var1);
   }

   public TestCase_608924B6393224547B305940BB04163D06411A8F8E12BBC0CCD9F084906135A6__233925634() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
