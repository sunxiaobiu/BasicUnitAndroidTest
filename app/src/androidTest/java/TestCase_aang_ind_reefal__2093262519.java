import android.app.Activity;
import android.graphics.Point;
import android.media.ImageReader;
import android.view.Surface;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aang_ind_reefal__2093262519 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      Point var5 = new Point();
      int var1 = var5.y;
      int var2 = var1;
      var1 = var5.x;
      ImageReader var6 = ImageReader.newInstance(var1, var2, 1, 2);
      Surface var7 = var6.getSurface();
   }

   public TestCase_aang_ind_reefal__2093262519() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
