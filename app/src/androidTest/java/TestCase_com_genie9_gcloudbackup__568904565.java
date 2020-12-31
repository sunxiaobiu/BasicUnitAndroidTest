import android.app.Activity;
import android.net.Uri;
import android.support.v4.print.PrintHelper;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_genie9_gcloudbackup__568904565 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var1 = var3.getActivity();
      PrintHelper var4 = new PrintHelper(var1);
      String var5 = "android";
      Object var2 = EasyMock.createMock(Uri.class);
      var4.printBitmap(var5, (Uri)var2);
   }

   public TestCase_com_genie9_gcloudbackup__568904565() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
