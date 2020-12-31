import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_catchingnow_icebox_196379464 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Context var3 = InstrumentationRegistry.getTargetContext();
      WallpaperManager var4 = WallpaperManager.getInstance(var3);
      boolean var5 = var4.isWallpaperSupported();
   }

   public TestCase_com_catchingnow_icebox_196379464() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
