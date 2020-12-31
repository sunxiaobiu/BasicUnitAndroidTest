import android.support.v4.media.session.PlaybackStateCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appgeneration_fews__1499245886 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      byte var1 = 1;
      var2.addCustomAction("com.appgeneration.ituner.CUSTOM_ACTION_TOGGLE_FULL", "toggle read full articles", var1);
   }
}
