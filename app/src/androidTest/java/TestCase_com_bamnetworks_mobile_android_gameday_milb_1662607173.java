import android.support.v4.app.ShareCompat;
import android.support.v4.app.ShareCompat.IntentBuilder;
import android.view.MenuItem;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bamnetworks_mobile_android_gameday_milb_1662607173 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MenuItem.class);
      Object var1 = EasyMock.createMock(IntentBuilder.class);
      ShareCompat.configureMenuItem((MenuItem)var0, (IntentBuilder)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
