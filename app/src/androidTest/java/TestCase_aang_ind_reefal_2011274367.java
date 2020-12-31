import android.app.Activity;
import android.graphics.Point;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Handler;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aang_ind_reefal_2011274367 {
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
      Object var7 = null;
      Object var8 = EasyMock.createMock(Handler.class);
      var6.setOnImageAvailableListener((OnImageAvailableListener)var7, (Handler)var8);
   }

   public TestCase_aang_ind_reefal_2011274367() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
