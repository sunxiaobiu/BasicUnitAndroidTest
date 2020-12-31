import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_bellmedia_bnngo_722507238 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      PackageManager var4 = var3.getPackageManager();
      Object var1 = EasyMock.createMock(ComponentName.class);
      var4.getActivityIcon((ComponentName)var1);
   }

   public TestCase_ca_bellmedia_bnngo_722507238() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
