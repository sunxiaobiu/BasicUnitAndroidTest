import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aang_ind_reefal_1818579073 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      Object var5 = var4.getSystemService("media_projection");
      MediaProjectionManager var6 = (MediaProjectionManager)var5;
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Intent.class);
      var6.getMediaProjection(var1, (Intent)var2);
   }

   public TestCase_aang_ind_reefal_1818579073() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
