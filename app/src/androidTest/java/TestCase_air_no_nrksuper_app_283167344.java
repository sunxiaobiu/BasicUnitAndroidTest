import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_no_nrksuper_app_283167344 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      WallpaperManager var4 = WallpaperManager.getInstance(var3);
      Object var1 = EasyMock.createMock(Bitmap.class);
      var4.setBitmap((Bitmap)var1);
   }

   public TestCase_air_no_nrksuper_app_283167344() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
