import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching_486962317 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      ActivityCompat.invalidateOptionsMenu((Activity)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
