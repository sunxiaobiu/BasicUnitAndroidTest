import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_desire2learn_campuslife_csulb_edu_directory__1501685967 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      PackageManager var4 = var3.getPackageManager();
      String var1 = "android";
      var4.getLeanbackLaunchIntentForPackage(var1);
   }
}
