import android.app.Activity;
import android.app.WallpaperManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_launcher_smart_android__805813495 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      WallpaperManager var5 = WallpaperManager.getInstance(var4);
      byte var1 = 1;
      byte var2 = 1;
      var5.getBuiltInDrawable(var1, var2, true, 0.5F, 0.5F);
   }

   public TestCase_com_launcher_smart_android__805813495() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
