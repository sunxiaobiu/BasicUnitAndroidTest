import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_barefootmediaministries_koay__1486233519 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      PackageManager var3 = var2.getPackageManager();
      PackageInfo var4 = var3.getPackageInfo("com.twitter.android", 0);
      String var5 = var4.toString();
   }

   public TestCase_com_barefootmediaministries_koay__1486233519() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
