import android.app.Activity;
import android.media.session.MediaController;
import android.media.session.MediaController.TransportControls;
import android.os.Bundle;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airkast_KCHZFM__1092522490 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      MediaController var5 = var4.getMediaController();
      TransportControls var6 = var5.getTransportControls();
      String var1 = "android";
      Object var2 = EasyMock.createMock(Bundle.class);
      var6.playFromSearch(var1, (Bundle)var2);
   }

   public TestCase_com_airkast_KCHZFM__1092522490() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
