import android.app.Activity;
import android.drm.DrmManagerClient;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asus_filemanager__35978132 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var1 = var2.getActivity();
      DrmManagerClient var3 = new DrmManagerClient(var1);
      String var4 = "android";
      var3.getOriginalMimeType(var4);
   }
}
