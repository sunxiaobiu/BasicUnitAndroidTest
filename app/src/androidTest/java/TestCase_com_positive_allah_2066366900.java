import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_positive_allah_2066366900 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      WallpaperManager var3 = WallpaperManager.getInstance(var2);
      WallpaperInfo var4 = var3.getWallpaperInfo();
      String var5 = var4.getSettingsActivity();
   }

   public TestCase_com_positive_allah_2066366900() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
