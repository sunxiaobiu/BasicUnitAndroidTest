import android.app.Activity;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E_316960194 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      MediaControllerCompat var4 = MediaControllerCompat.getMediaController(var3);
      Object var1 = EasyMock.createMock(Callback.class);
      var4.unregisterCallback((Callback)var1);
   }

   public TestCase_01F43BBD70800267D46EDA936621C4DFFE292EBD59B3448689EBDE206501484E_316960194() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
