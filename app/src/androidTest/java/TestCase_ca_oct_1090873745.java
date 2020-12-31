import android.app.Activity;
import android.app.DownloadManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_oct_1090873745 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var5 = this.mActivityRule;
      Activity var6 = var5.getActivity();
      Object var7 = var6.getSystemService("download");
      DownloadManager var8 = (DownloadManager)var7;
      String var1 = "android";
      String var2 = "android";
      long var3 = 1L;
      var8.addCompletedDownload(var1, "Tax Receipt", false, "application/pdf", var2, var3, true);
   }

   public TestCase_ca_oct_1090873745() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
