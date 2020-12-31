import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__1738388269 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      TaskStackBuilder var4 = TaskStackBuilder.create(var3);
      Object var1 = EasyMock.createMock(Intent.class);
      var4.addNextIntentWithParentStack((Intent)var1);
   }

   public TestCase_ae_gov_dcpetitions_mobile_iphone__1738388269() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
