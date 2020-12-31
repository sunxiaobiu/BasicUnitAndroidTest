import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.android.volley.toolbox.DiskBasedCache;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import java.io.File;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_star_app__1485642831 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      File var3 = var1.getExternalCacheDir();
      File var4 = var1.getCacheDir();
      var3 = new File(var4, "EchoEntertainmentImages");
      DiskBasedCache var5 = new DiskBasedCache(var3, 26214400);
      var5.clear();
   }

   public TestCase_au_com_star_app__1485642831() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
