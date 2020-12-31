import android.app.Activity;
import android.net.Uri;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_camerasideas_instashot__2039428577 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = new ActivityTestRule(Activity.class);
      Activity var4 = var3.getActivity();
      String var1 = "android";
      Object var2 = EasyMock.createMock(Uri.class);
      var4.grantUriPermission(var1, (Uri)var2, 1);
   }
}
